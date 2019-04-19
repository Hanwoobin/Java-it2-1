package chap04_prac07;

import java.util.Scanner;

class Day{
	private String wk;
	public void set(String wk) {this.wk = wk; }
	public String get() {return wk;}
	public void show(){
		if(wk == null) System.out.println("�����ϴ� ");
		else System.out.println(wk+"�Դϴ�.");
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
		System.out.println("��¥(1~30)?");
		int day = scanner.nextInt();
		System.out.println("���� (��ĭ���� �Է�)?");
		String work = scanner.next();
		day--;
		if(day < 0 || day > nDays){
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�. !");
			return;
		}
		days[day].set(work);
	}
	private void view()
	{
		System.out.println("��¥(1~30?");
		int day = scanner.nextInt();
		day--;
		if(day < 1 || day > nDays)
		{
			System.out.println("��¥�� �Է��Ͽ����ϴ�. !");
			return;
		}
		System.out.println((day+1)+"���� ������ ");
		days[day].show();
	}
	
	private void finsh()
	{
		scanner.close();
		System.out.println("���α׷� �����մϴ�.");
	}
	public void run()
	{
		System.out.println("�̹��� ������ ���� ���α׷�");
		
		while(true){
			System.out.println("����(�Է�: 1, ���� : 2, ������: 3 >>>");
			int menu = scanner.nextInt();
			switch(menu){
			case 1: input(); break;
			case 2: view(); break;
			case 3: finsh(); break;
			default : 
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
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
