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
		System.out.println("�������� �õ� Ŵ");
	}
	
	public void openRoof() {
		System.out.println("���� ��");
	}
	public void closeRoof() {
		System.out.println("���� ����");
	}
}
