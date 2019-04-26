public class asd {
	int ra;
	String name;

	public asd() {
		ra = 1;
		name = "";

	}

	public asd(int r, String n) {
		ra = r;
		name = n;

	}

	public double getArea() {
		return 3.14 * ra * ra;

	}

	public static void main(String[] args) {
		
		asd pizza = new asd(10, "피자마시쪙");
		double area = pizza.getArea();
		System.out.println(pizza.name+" " + area);

		asd donut = new asd();
		donut.name = "피자라능";
		area = donut.getArea();
		System.out.println(donut.name+" " + area);

	}

}