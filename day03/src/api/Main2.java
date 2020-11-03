package api;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		// 객체배열
		//Book[] books = new Book[5];
		ArrayList<Book> books = new Arraylist<Book>(); // <>은 변형된 배열
		//int count = 0; 하나하나 잡아주기 때문에 count 변수가 필요없음.
		
		// 객체생성
//		books[count++] = new Book("나루토",4000);
		books.add(new Book("나루토",4000)); // 추가
//		books[count++] = new Book("원피스",4500);
		books.add(new Book("원피스",4500));
//		books[count++] = new Book("슬램덩크",5000);
		books.add(new Book("슬램덩크",5000));
		
		// 객체출력
//		for (int i = 0; i < count; i++) {
//			System.out.println(books[i].toString());
//		}
		for (Book b : books) {
			System.out.println(b.toString());
		}
	}
}
class Book{
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s(%d원)",this.title,this.price);
	}
}