package day01_2;

public class Tri extends Shape{
	@Override
	double getArea(double w, double h) {
		area = w*h /2;
		return Double.parseDouble(String.format("%.2f", area));		
	}
}
