package chap04_ex7;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[2]; //�迭����
		Scanner s1 = new Scanner(System.in);//�Է� �ޱ� ���� �غ�

		
		for (int i = 0; i < book.length; i++) {// book.length �� 2�̴�.
			System.out.print(">>�����Է� ");
			/*String e = s1.nextLine();
			System.out.print(">>���� ");
			String w = s1.nextLine();
			book[i] = new Book(e,w);
			*/ //�ؿ��� �������� �ϽŰ�
			String title = s1.nextLine();
			System.out.print("�����Է� ");
			String author = s1.nextLine();
			book[i] = new Book(title,author);	
		}
		
		for(int j = 0; j<book.length;j++)
		{
			System.out.println("("+book[j].title + ", "+book[j].author+") ");
			
		}

	}

}
