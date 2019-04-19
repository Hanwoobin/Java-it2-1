import java.util.Scanner;


class Circle
{
	private double x, y;
	private int radius;
	public Circle(double x, double y,int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("("+x+","+y+")"+ radius);
	}
}

public class CircleManager {
	
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);
		Circle C [] = new Circle[3];
		for(int i = 0; i <C.length;i++)
		{
			System.out.println("x, y, radius >>");
			double x= s1.nextDouble();
			double y = s1.nextDouble();
			int radius = s1.nextInt();
			C[i] = new Circle(x,y,radius);
		}
		for(int i=0;i<C.length;i++) C[i].show();
		s1.close();
	}

}

