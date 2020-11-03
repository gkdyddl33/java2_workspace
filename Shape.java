package abstractTest;

public abstract class Shape {
	double area; // 면적
	
	// 바디가 없는 "추상메소드"
	// 반드시 자식에서 재정의(구현)
	abstract double gerArea(double w,double h);
	
	// 일반메소드
	void normalMethod() {
		System.out.println("추상 클래스의 일반 메소드 호출");
	}
	
	// final int data = 10 ; -> data = 30 : 불가능 / final 키워드로 인해
	// 메소드는 저장공간 -> 안에 있는 값을 바꾸지 말라는 의미의 "final" -> 재정의 불가능
	final void finalMethod() {
		System.out.println("추상 클래스의 final 메소드 호출");
	}
}
