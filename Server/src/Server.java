import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner s1 = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 대기중..");
			socket = listener.accept();//클라이언트로부터 연결 요청대기.
			System.out.println("연결되었다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				String inputMessage = in.readLine();//클라이언트로부터 한 행 읽기
				if (inputMessage.equalsIgnoreCase("bye")){
					System.out.println("잘가");
					break;
				}
				System.out.println("클라이언트 :" +inputMessage);
				System.out.print("보내기>>");//프롬프트
				String outputMessage = s1.nextLine();//키보드에서 한행읽기.
				out.write(outputMessage+"\n");//키보드에서 읽은 문자열 전송.
				out.flush();//out의 스트림 버퍼에 있는 모든 문자열 전송
			}
		}catch(IOException e ) {System.out.println(e.getMessage());
		}finally {
			try {
				s1.close();
				socket.close();
				listener.close();
			}catch(IOException e ) {System.out.println("클라이언트와 채팅중 오류가 발생");}
		}
	}
}
