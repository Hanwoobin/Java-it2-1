package chap04_prac03;

import java.util.concurrent.ConcurrentHashMap;

public class song {
	private String title;
	private String artist;
	private int year;
	private String country;

	public song() {
	}

	public song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show(){
		System.out.println(year + "���ؿ� �������");
		System.out.println(country + "���� ���������");
		System.out.println(artist+"(��)�� ����");
		System.out.println(title);
	}
	
	public static void main(String args[]){
		song mf = new song("����","SG���ʺ�",1994,"�ѱ�");
		mf.show();
	}
}
