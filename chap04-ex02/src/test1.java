import java.util.Scanner;

public class test1 {
	int wight;
	int height;

	public test1() {

	}
	public int getArea()
	{
		return height * wight;
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		test1 rect = new test1();
		rect.wight = s1.nextInt();
		rect.height = s1.nextInt();
		System.out.println(rect.wight +" "+rect.height +" " );
	}

}
