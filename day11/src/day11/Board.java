package day11;

public class Board {
	public static void main(String[] args) {
		Shape abs = new Shape() {
			@Override
			double getArea(double w, double h) {
				System.out.println("�ȳ� ���");
				return 0;
			}
		};
	}
}
