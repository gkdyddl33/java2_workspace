package day01_2;

public class SuperCar extends Car{
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	@Override
	public void enginStart() {	
		//super.enginStart();
		System.out.println("�������� �õ� Ŵ");
	}
	@Override
	public void enginStop() {
		super.enginStop();
	}
	public void openRoof() {
		System.out.println("���� ��");
	}
	public void closeRoof() {
		System.out.println("���� ����");
	}
}
