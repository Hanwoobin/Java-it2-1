package chap04_ex07;

import java.util.Scanner;

public class BookArray {
	public static void main(String args[]) {
			Book[] book = new Book[2];
			
			Scanner s1 = new Scanner(System.in);
			for(int i =0 ; i< book.length;i++) {
					System.out.println("���� �Է��� > ");
					String title = s1.nextLine();
					System.out.println("�����Է� -> ");
					String Author = s1.nextLine();
					book[i] = new Book(title,Author);
			}
			
			for(int i = 0;i < book.length;i++) {
					System.out.println(book[i].Title+book[i].Author);;
			}
	}
}
