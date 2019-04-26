

public class Rectangle {

	private int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("("+x+","+y+")����");
		System.out.println("ũ�Ⱑ"+width +"x"+height+"�� �簢�� ");
	}
	
	public int square()
	{
		return width*height;
	}
	
	public boolean contains(Rectangle r)
	{
		if(x  <r.x && y < r.y
				&& x+width > r.x+r.width
				&& y+height > r.y+r.height) return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("S�� ������ " + s.square());
		if(t.contains(r))System.out.println("T�� R�� ����");
		if(t.contains(s)) System.out.println("t�� S������");
	}

}