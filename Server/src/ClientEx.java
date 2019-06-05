import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner s1 = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999 );//클라이언트 소켓을 생성 서버에 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.println("보내기 >>");//프롬프트
				String outputMessage = s1.nextLine();//키보드에서 한 행 읽기
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n"); //문자열 전송
					out.flush();
					break;
				}
				out.write(outputMessage+"\n");//키보드에서 읽은 문자열 전송
				out.flush();//out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage = in.readLine();//서버로부터 한행 수신
				System.out.println("서버 : " + inputMessage);
				
			}
		}catch (IOException e ){
			System.out.println(e.getMessage());
		}finally {
			try {
				s1.close();
				if(socket != null) socket.close();
				
			}catch(IOException e ){
				System.out.println("서버와 채팅중 오류가 발생");
			}
		}
	}
}
