package interTest;

// 상병
public class Corporal implements Solider {

	@Override
	public void eat() {
		System.out.println("경치를 보며 식사한다.");

	}

	@Override
	public void sleep() {
		System.out.println("잠을 잘잔다.그리고 후임들과 산책간다.");

	}

	@Override
	public void work() {
		System.out.println("후임들에게 일을 알려준다.");

	}

	@Override
	public void salute() {
		System.out.println("ㅊㅅ");

	}

}
