package day01;

public class SuperCar extends Car {
	// 부모클래스를 사용 -> 선언이 아님
	// 공통요소를 car에 묶여있음
	String mode;
	
	public SuperCar() {}
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	// 부모클래스꺼를 다시 수정하거나 사용하기 위해서는 "오버라이딩" -> "재정의"
	@Override
	public void engineStart() {
		/*super.engineStart(); 부모꺼를 호출 먼저 해준다.*/
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	public void engineStop() {
		super.engineStop();
		System.out.println("음성으로 시동 끔");
	}
	
	public void openRoof() {
		System.out.println("지붕 염");
	}
	
	public void closeRoof() {
		System.out.println("지붕 닫음");
	}
}
