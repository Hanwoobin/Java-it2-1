
public class Circle {
	int radius;//������
	String name;//�̸�

	public Circle() {//������

	}

	public double getArea() {//���� ����
		return 3.14 * radius *radius;
	}

	public static void main(String[] args) {
		Circle pizza;// = new Circle();
		pizza = new Circle();
		pizza.name = "����";
		pizza.radius = 5;
		double area = pizza.getArea();
		System.out.println(pizza.name +"�� ���� :"+ area);
		
		Circle Donert = new Circle();
		Donert.name = "����";
		Donert.radius = 10;
		double a = Donert.getArea();
		System.out.println(Donert.name+"�� ����"+a);
		
	
		
	}

}
