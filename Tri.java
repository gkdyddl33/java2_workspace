package abstractTest;

public class Tri extends Shape {

	@Override
	double gerArea(double w, double h) {
		area = w*h/2;
		return Double.parseDouble(String.format("%.2f", area)); // 형변환해주기 format = print"f"
	}
	// final 메소드를 찾고 싶어도 안나온다. 절대 사용할 수 없는 거기 때문에
}
