package day01;

public class Car {
	// �귻��,����,����
	String brand;
	String color;
	int price;
	// �⺻������, �ʱ�ȭ ������ ����
	public Car() {}
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// �õ��ѱ�,�õ����� �޼ҵ�
	public void enginStart() {
		System.out.println("����� �õ� Ŵ");
	}
	public void enginStop() {
		System.out.println("����� �õ� ��");
	}
}
