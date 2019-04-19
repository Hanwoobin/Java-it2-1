package chap04_prac10;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"사랑","프로그래밍","과거","인평" };
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
		System.out.println("한영 단어 검색 프로그램입니다. ");
		while(true){
				System.out.println("한글단어?");
				String kor = s1.next();
				if(kor.equals("그만")) break;
				String eng = Dictionary.kor2Eng(kor);
				if(eng == null)
						System.out.println(kor+"는 저의 사전에 없습니다.");
				else 
					System.out.println(kor + "은" +eng);
		}
		s1.close();

	}

}
