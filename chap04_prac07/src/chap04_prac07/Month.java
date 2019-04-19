package chap04_prac07;

import java.util.Scanner;

class Day{
	private String wk;
	public void set(String wk) {this.wk = wk; }
	public String get() {return wk;}
	public void show(){
		if(wk == null) System.out.println("없습니다 ");
		else System.out.println(wk+"입니다.");
	}
}


public class Month {
	private int nDays;
	private Day [] days;
	private Scanner scanner;
	
	public Month(int nDays){
		this.nDays = nDays;
		this.days = new Day [nDays];
		for(int i = 0; i< days.length;i++)
		{
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}
	
	public void input(){
		System.out.println("날짜(1~30)?");
		int day = scanner.nextInt();
		System.out.println("할일 (빈칸없이 입력)?");
		String work = scanner.next();
		day--;
		if(day < 0 || day > nDays){
			System.out.println("날짜 잘못 입력하였습니다. !");
			return;
		}
		days[day].set(work);
	}
	private void view()
	{
		System.out.println("날짜(1~30?");
		int day = scanner.nextInt();
		day--;
		if(day < 1 || day > nDays)
		{
			System.out.println("날짜를 입력하였습니다. !");
			return;
		}
		System.out.println((day+1)+"오늘 할일은 ");
		days[day].show();
	}
	
	private void finsh()
	{
		scanner.close();
		System.out.println("프로그램 종료합니다.");
	}
	public void run()
	{
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		while(true){
			System.out.println("할일(입력: 1, 보기 : 2, 끝내기: 3 >>>");
			int menu = scanner.nextInt();
			switch(menu){
			case 1: input(); break;
			case 2: view(); break;
			case 3: finsh(); break;
			default : 
				System.out.println("잘못 입력하였습니다.");
			}
			System.out.println();
			
		}
	}
	public static void main(String args[])
	{
		Month april = new Month(30);
		april.run();
	}
}
