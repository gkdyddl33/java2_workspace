package day01;

public abstract class Shape {
	double area;
	// �߻�޼ҵ� = �ٵ� ���� ���� = ����� �� �ٵ� ������(������)
	abstract double getArea(double w,double h);
	
	void normalMethod() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼ҵ� ȣ��");
	}
	
	final void finalMethod() {
		System.out.println("�߻� Ŭ������ final �޼ҵ� ȣ��");
	}
}
