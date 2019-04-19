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
		System.out.println("인원수 >>");
		int n = s1.nextInt();

		pArray = new Phone[n];
		for (int i = 0; i < pArray.length; i++) {
			System.out.println("이름과 전화번호 (이름과 번호는 빈칸없이 입력 ) >>");
			String name = s1.next();
			String tel = s1.next();
			pArray[i] = new Phone(name, tel);
		}

		System.out.println("저장되었습니다....");

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
				System.out.println("검색할 이름>>");
				String name = s1.next();
				if(name.equals("그만"))
					break;
				String tel = search(name);
				if(tel == null)
					System.out.println(name +"이 없습니다.");
				else
					System.out.println(name+"의 번호는"+tel+"입니다.");
		}
		s1.close();
	}

	public static void main(String[] args) {
			new PhoneBook().run();
	}

}
