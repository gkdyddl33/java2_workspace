package day11;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	@Override
	public void enginStart() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
	}
	
	public void openRoof() {
		System.out.println("ÁöºØ ¿°");
	}
	public void closeRoof() {
		System.out.println("ÁöºØ ´ÝÀ½");
	}
}
