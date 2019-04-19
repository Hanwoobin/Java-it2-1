

public class Rectangle {

	private int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("("+x+","+y+")에서");
		System.out.println("크기가"+width +"x"+height+"인 사각형 ");
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
		System.out.println("S의 면적은 " + s.square());
		if(t.contains(r))System.out.println("T는 R을 포함");
		if(t.contains(s)) System.out.println("t는 S를포함");
	}

}
