import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	private Scanner s1;
	private Phone[] pArray;

	public PhoneBook() {
		s1 = new Scanner(System.in);
	}

	void read() {
		System.out.println("�ο��� >>");
		int n = s1.nextInt();

		pArray = new Phone[n];
		for (int i = 0; i < pArray.length; i++) {
			System.out.println("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� ��ĭ���� �Է� ) >>");
			String name = s1.next();
			String tel = s1.next();
			pArray[i] = new Phone(name, tel);
		}

		System.out.println("����Ǿ����ϴ�....");

	}

	String search(String name) {
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name))
				;
			return pArray[i].getTel();
		}
		return null;
	}

	void run()
	{
		read();
		while(true) {
				System.out.println("�˻��� �̸�>>");
				String name = s1.next();
				if(name.equals("�׸�"))
					break;
				String tel = search(name);
				if(tel == null)
					System.out.println(name +"�� �����ϴ�.");
				else
					System.out.println(name+"�� ��ȣ��"+tel+"�Դϴ�.");
		}
		s1.close();
	}

	public static void main(String[] args) {
			new PhoneBook().run();
	}

}
