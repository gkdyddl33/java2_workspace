package daylast;

public class Car {
	String brand;
	String color;
	int price;
	
	public Car() {}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void enginStart() {
		System.out.println("����� �õ� Ŵ");
	}
	public void enginStop() {
		System.out.println("����� �õ� ��");
	}
}
