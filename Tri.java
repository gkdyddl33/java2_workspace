package abstractTest;

public class Tri extends Shape {

	@Override
	double gerArea(double w, double h) {
		area = w*h/2;
		return Double.parseDouble(String.format("%.2f", area)); // ����ȯ���ֱ� format = print"f"
	}
	// final �޼ҵ带 ã�� �; �ȳ��´�. ���� ����� �� ���� �ű� ������
}
