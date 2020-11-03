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
		System.out.println("�������� �õ� Ŵ");
	}
	@Override
	public void engineStop() {
		super.engineStop();
	}
	
	public void openRoof() {
		System.out.println("���� ��");
	}
	public void closeRoof() {
		System.out.println("���� ����");
	}
}
