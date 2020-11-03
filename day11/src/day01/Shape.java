package day01;

public abstract class Shape {
	double area;
	// 추상메소드 = 바디가 없이 정의 = 사용할 때 바디가 열린다(생성자)
	abstract double getArea(double w,double h);
	
	void normalMethod() {
		System.out.println("추상 클래스의 일반 메소드 호출");
	}
	
	final void finalMethod() {
		System.out.println("추상 클래스의 final 메소드 호출");
	}
}
