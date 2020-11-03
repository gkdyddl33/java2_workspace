package daylast;


public abstract class Shape {
	double area;
	
	abstract double getArea(double w,double h);
	
	void normalMethod() {
		System.out.println("추상클래스의 일반 메소드 호출");
	}
	
	final void finalMethod() {
		System.out.println("추상클래스의 final 메소드 호출");
		}
	}
