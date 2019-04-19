package chap04_prac11;

import java.util.Scanner;

class Add{
	private int a,b;
	public void setValue(int a, int b){
		this.a = a;
		this.b =b;
	}
	public int calculate(){
		return a+b;
	}
}

class Mul{
		private int a,b;
		public void setValue(int a, int b){
				this.a = a;
				this.b = b;
		}
		public int caluclate(){
				return a*b;
		}
}
class Sub {
	private int a,b;
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int calculate()
	{
			return a-b;
	}
}

class Div{
		private int a,b;
		public void setValue(int a, int b){
				this.a = a;
				this.b = b;
		}
		public int calculate()
		{
				int res = 0;
				try {
						res = a/b;
				}catch(ArithmeticException e) {
						System.out.println("0으로 나눌 수없습니다.");
				}
				return res;
		}
}


public class calc {
	
	public static void main(String args[]) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("두 정수와 연산자를 입력해 >>");
			int a = s1.nextInt();
			int b = s1.nextInt();
			char operator = s1.next().charAt(0);
			switch (operator) {
				case '+':
						Add add = new Add();
						add.setValue(a, b);
						System.out.println(add.calculate());
						break;
				case '-':
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(sub.calculate());
					break;
				case '*':
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(mul.caluclate());
					break;
				case '/':
						Div div = new Div();
						div.setValue(a, b);
						System.out.println(div.calculate());
						break;
				default :
						System.out.println("잘못된 연산자입니다.");
			}
			s1.close();
	}
}
