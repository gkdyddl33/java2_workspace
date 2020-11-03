package day02;

public abstract class Army implements Solider{
	@Override
	public void work() {;} 
	
	@Override
	public void salute() {;}
	
	@Override
	public void sleep() {;}
	
	@Override
	public void eat() {;}
	
	// Army를 sergeant에 상속을 함으로써 해당 창에서 이제 아무거나 정의 할 수 있다.
	// 구현한 클래스에서는 반드시 모든 추상메소드를 재정의 해야 한다.
	// 하지만 부모의 추상 메소드 중 골라서 재정의 해야 할 때에는 바로 지정받지 않고 먼저 추상클래스에
	// 지정해 준다. 이때, 추상클래스의 목적은 지정받은 인터페이스의 추상메소드에
	// 바디를 만들어 주어서 강제성을 소멸해 주는 역할이다. 또는 목적이다.

	// sergeant클래스는 구현하고 싶지 않은 추상메소드가 있기 때문에 강제성이 소멸된 추상클래스를
	// 상속받는다.
}
