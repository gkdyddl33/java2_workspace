package finaltest;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	@Override
	public void engineStart() {
		//super.engineStart();
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
	}
	@Override
	public void engineStop() {
		super.engineStop();
	}
	
	public void openRoof() {
		System.out.println("ÁöºØ ¿°");
	}
	public void closeRoof() {
		System.out.println("ÁöºØ ´ÝÀ½");
	}
}
