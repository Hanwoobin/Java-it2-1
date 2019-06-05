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
			System.out.println("������ �����..");
			socket = listener.accept();//Ŭ���̾�Ʈ�κ��� ���� ��û���.
			System.out.println("����Ǿ���.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				String inputMessage = in.readLine();//Ŭ���̾�Ʈ�κ��� �� �� �б�
				if (inputMessage.equalsIgnoreCase("bye")){
					System.out.println("�߰�");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ :" +inputMessage);
				System.out.print("������>>");//������Ʈ
				String outputMessage = s1.nextLine();//Ű���忡�� �����б�.
				out.write(outputMessage+"\n");//Ű���忡�� ���� ���ڿ� ����.
				out.flush();//out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
			}
		}catch(IOException e ) {System.out.println(e.getMessage());
		}finally {
			try {
				s1.close();
				socket.close();
				listener.close();
			}catch(IOException e ) {System.out.println("Ŭ���̾�Ʈ�� ä���� ������ �߻�");}
		}
	}
}
