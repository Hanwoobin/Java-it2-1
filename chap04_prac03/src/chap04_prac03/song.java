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
		System.out.println(year + "년해에 만들어진");
		System.out.println(country + "에서 만들어져서");
		System.out.println(artist+"(이)가 만든");
		System.out.println(title);
	}
	
	public static void main(String args[]){
		song mf = new song("라라라","SG워너비",1994,"한국");
		mf.show();
	}
}
