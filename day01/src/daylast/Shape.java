package daylast;


public abstract class Shape {
	double area;
	
	abstract double getArea(double w,double h);
	
	void normalMethod() {
		System.out.println("�߻�Ŭ������ �Ϲ� �޼ҵ� ȣ��");
	}
	
	final void finalMethod() {
		System.out.println("�߻�Ŭ������ final �޼ҵ� ȣ��");
		}
	}
