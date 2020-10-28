package day01;

public class Car {
	// 브렌드, 색상, 가격
	String brand;
	String color;
	int price;
	
	// 기본생성자, 초기화 생성자 선언
	public Car() {}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// 시동 켜기, 시동끄기(켜짐,꺼짐 출력하는 메소드)
	public void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	public void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}
