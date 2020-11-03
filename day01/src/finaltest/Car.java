package finaltest;

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
	public void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	public void engineStop() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ²û");
	}
}
