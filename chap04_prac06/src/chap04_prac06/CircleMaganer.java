package chap04_prac06;

import java.util.Scanner;

class Circle
{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("("+x+","+y+")"+ radius);
	}
	public double getArea()
	{
		return Math.PI*radius;
	}
}

public class CircleMaganer {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i = 0; i<c.length;i++)
		{
			System.out.println("x,y, radius >>");
			double x = s1.nextDouble();
			double y = s1.nextDouble();
			int radius = s1.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		int biggestIndex = 0;
		for(int i = 1; i<c.length;i++)
		{
			if(c[biggestIndex].getArea() < c[i].getArea())
				biggestIndex = i;
		}
		
		System.out.println(" ");
		c[biggestIndex].show();
		s1.close();
	}

}
