
public class Book {
		String title;
		String author;
		
		void show() {
				System.out.println(title +" "+author);
		}
		public Book() {
				this("", "");
		}
		public Book(String title, String author) {
				this.title= title;
				this.author= author;
		}
	
	public static void main(String[] args) {
		Book little = new Book("�����","����");
		Book loveS = new Book("���S", "������");
		Book empty = new Book();
		
		little.show();
		loveS.show();

	}

}
