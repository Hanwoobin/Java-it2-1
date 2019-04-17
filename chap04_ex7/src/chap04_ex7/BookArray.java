package chap04_ex7;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book[] book = new Book[2]; //배열선언
		Scanner s1 = new Scanner(System.in);//입력 받기 위한 준비

		
		for (int i = 0; i < book.length; i++) {// book.length 는 2이다.
			System.out.print(">>제목입력 ");
			/*String e = s1.nextLine();
			System.out.print(">>저자 ");
			String w = s1.nextLine();
			book[i] = new Book(e,w);
			*/ //밑에는 선생님이 하신것
			String title = s1.nextLine();
			System.out.print("저자입력 ");
			String author = s1.nextLine();
			book[i] = new Book(title,author);	
		}
		
		for(int j = 0; j<book.length;j++)
		{
			System.out.println("("+book[j].title + ", "+book[j].author+") ");
			
		}

	}

}
