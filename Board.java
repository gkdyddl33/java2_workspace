package abstractTest;

public class Board {
	public static void main(String[] args) {
		// 구현을 안한 상태라면 만들 때 구현도 자동으로 생성해준다.
		Shape abs = new Shape() {
						// 익명클래스 = shape()에 이름이 없음 , 클래스 중괄호
			
			@Override
			double gerArea(double w, double h) {
				System.out.println("안녕 까꿍");
				return 0;
			}
		};
	}
}
