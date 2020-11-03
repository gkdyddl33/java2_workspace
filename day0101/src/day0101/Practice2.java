package day0101;

import java.util.Arraylist;

public class Practice2 {
	// 쇼핑 장바구니
	// 상품객체를 장바구니에 담고, 이를 모두 출력하시오.
	//			Goods		->extends, abstract class, concrete class
	//	Monitor TV Computer
	public static void main(String[] args) {
		// 상품 객체생성
		Goods monitor = new Monitor("FHD 와이드 모니터",450000);
		Goods tv = new TV("SK 벽걸이 TV",2350000);
		Goods computer = new Computer("노트북 고급형",1650000);
		
		// 장바구니에 담기
		Arraylist <Goods> cart = new Arraylist <Goods>();
		cart.add(monitor);
		cart.add(tv);
		cart.add(computer);
		
		// 장바구니 내역 출력
		for(Goods g : cart) {
			System.err.println(g.toString());			
		}
	}
}
abstract class Goods{
	// 추상클래스 필드
	protected String name;
	protected int price;
	// 추상클래스 생성자
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	// toString() 메소드 오버라이딩
	public String toStirng() {
		return String.format("%s:%d원", name,price);
	}
}
class Monitor extends Goods{
	public Monitor(String name,int price) {
		super(name,price);
	}
}
class TV extends Goods{
	public TV(String name,int price) {
		super(name,price);
	}
}
class Computer extends Goods{
	public Computer(String name,int price) {
		super(name,price);
	}
}