package abstractTest;

public class Board {
	public static void main(String[] args) {
		// ������ ���� ���¶�� ���� �� ������ �ڵ����� �������ش�.
		Shape abs = new Shape() {
						// �͸�Ŭ���� = shape()�� �̸��� ���� , Ŭ���� �߰�ȣ
			
			@Override
			double gerArea(double w, double h) {
				System.out.println("�ȳ� ���");
				return 0;
			}
		};
	}
}
