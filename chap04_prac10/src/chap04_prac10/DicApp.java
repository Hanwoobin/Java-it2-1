package chap04_prac10;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���","���α׷���","����","����" };
	private static String [] eng = {"love","programing","history","inpyung"};
	public static String kor2Eng(String word) {
			for(int i =0; i<kor.length;i++){
					if (kor[i].equals(word))
							return eng[i];
			}
			return null;
	}
}


public class DicApp {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�. ");
		while(true){
				System.out.println("�ѱ۴ܾ�?");
				String kor = s1.next();
				if(kor.equals("�׸�")) break;
				String eng = Dictionary.kor2Eng(kor);
				if(eng == null)
						System.out.println(kor+"�� ���� ������ �����ϴ�.");
				else 
					System.out.println(kor + "��" +eng);
		}
		s1.close();

	}

}
