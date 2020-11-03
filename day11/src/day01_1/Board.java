package day01_1;

public class Board {
	public static void main(String[] args) {
		Shape abs = new Shape() {
			
			@Override
			double getArea(double w, double h) {
				area = w*h/2;
				return Double.parseDouble(String.format("%.2f", area));
			}
		};
	}
}
