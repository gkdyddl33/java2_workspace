package api;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		// ��ü�迭
		//Book[] books = new Book[5];
		ArrayList<Book> books = new Arraylist<Book>(); // <>�� ������ �迭
		//int count = 0; �ϳ��ϳ� ����ֱ� ������ count ������ �ʿ����.
		
		// ��ü����
//		books[count++] = new Book("������",4000);
		books.add(new Book("������",4000)); // �߰�
//		books[count++] = new Book("���ǽ�",4500);
		books.add(new Book("���ǽ�",4500));
//		books[count++] = new Book("������ũ",5000);
		books.add(new Book("������ũ",5000));
		
		// ��ü���
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
		return String.format("%s(%d��)",this.title,this.price);
	}
}