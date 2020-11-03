package daylast;

public class Private implements Solider{
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
