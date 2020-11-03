package day01;

public class SuperCar extends Car {
	// �θ�Ŭ������ ��� -> ������ �ƴ�
	// �����Ҹ� car�� ��������
	String mode;
	
	public SuperCar() {}
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	// �θ�Ŭ�������� �ٽ� �����ϰų� ����ϱ� ���ؼ��� "�������̵�" -> "������"
	@Override
	public void engineStart() {
		/*super.engineStart(); �θ𲨸� ȣ�� ���� ���ش�.*/
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	public void engineStop() {
		super.engineStop();
		System.out.println("�������� �õ� ��");
	}
	
	public void openRoof() {
		System.out.println("���� ��");
	}
	
	public void closeRoof() {
		System.out.println("���� ����");
	}
}
