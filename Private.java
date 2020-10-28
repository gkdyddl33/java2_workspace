package interTest;

// 2등병 = 군인이라는 틀 안에 있는 메소드
public class Private implements Solider { // 자바에서는 다중상속을 사용안함 -> 인터페이스에서는 가능! solider,...가능

	// 타입을 하나 더 만들고 싶을 때 사용
	// ex) Solider sd = new Private(); = new로 구현을 했기 때문에 값 넣기 가능!!!!
	// 아래처럼 틀을 제공해 주는 것이 interface
	// 추상메소드가 구현이 안되어 있다면 오류가 남
	
	@Override
	public void eat() {
		System.out.println("허리를 90도로 펴고 식사한다.그러다 어디 간다.");		
	}

	@Override
	public void sleep() {
		System.out.println("고향 생각에 잠이 잘 안온다.그러다 어디 간다.");		
	}

	@Override
	public void work() {
		System.out.println("열심히 뛰지만 결과가 좋지 않다.그래서 어디 간다.");		
	}

	@Override
	public void salute() {
		System.out.println("충!!!!!!!!!!!!!!!성!!!!!!!!!!!!!!!");		
	}
	
	
}
