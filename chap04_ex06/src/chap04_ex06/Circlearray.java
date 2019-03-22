package chap04_ex06;

public class Circlearray {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];

		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea()+"");
		}

	}

}
