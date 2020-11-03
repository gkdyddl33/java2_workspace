package day01;

public class SoliderMain {
	// 병장에서 2가지 메소드만 출력하게 끔 만들어보기
	// 찾아보자.
	public static void main(String[] args) {
		Private two = new Private();
		Corporal one = new Corporal();
		Sergent top = new Sergent() { //익명클래스

			@Override
			public void work() {
				System.out.println("맛있게 먹는다.");
				
			}

			@Override
			public void salute() {
				System.out.println("낮잠도 자면서 또 잔다.");
				
			}
			
		};
		two.eat();
		two.sleep();
		top.work();
		top.salute();
	}
}
