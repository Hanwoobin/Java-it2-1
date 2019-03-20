
public class Circle {
	int radius;//반지름
	String name;//이름

	public Circle() {//생성자

	}

	public double getArea() {//원의 면적
		return 3.14 * radius *radius;
	}

	public static void main(String[] args) {
		Circle pizza;// = new Circle();
		pizza = new Circle();
		pizza.name = "나님";
		pizza.radius = 5;
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적 :"+ area);
		
		Circle Donert = new Circle();
		Donert.name = "도넛";
		Donert.radius = 10;
		double a = Donert.getArea();
		System.out.println(Donert.name+"의 면적"+a);
		
	
		
	}

}
