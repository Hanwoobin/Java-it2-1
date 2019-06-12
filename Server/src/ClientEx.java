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
			socket = new Socket("localhost",9999 );//Ŭ���̾�Ʈ ������ ���� ������ ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.println("������ >>");//������Ʈ
				String outputMessage = s1.nextLine();//Ű���忡�� �� �� �б�
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n"); //���ڿ� ����
					out.flush();
					break;
				}
				out.write(outputMessage+"\n");//Ű���忡�� ���� ���ڿ� ����
				out.flush();//out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage = in.readLine();//�����κ��� ���� ����
				System.out.println("���� : " + inputMessage);
				
			}
		}catch (IOException e ){
			System.out.println(e.getMessage());
		}finally {
			try {
				s1.close();
				if(socket != null) socket.close();
				
			}catch(IOException e ){
				System.out.println("������ ä���� ������ �߻�");
			}
		}
	}
}