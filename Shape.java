package abstractTest;

public abstract class Shape {
	double area; // ����
	
	// �ٵ� ���� "�߻�޼ҵ�"
	// �ݵ�� �ڽĿ��� ������(����)
	abstract double gerArea(double w,double h);
	
	// �Ϲݸ޼ҵ�
	void normalMethod() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼ҵ� ȣ��");
	}
	
	// final int data = 10 ; -> data = 30 : �Ұ��� / final Ű����� ����
	// �޼ҵ�� ������� -> �ȿ� �ִ� ���� �ٲ��� ����� �ǹ��� "final" -> ������ �Ұ���
	final void finalMethod() {
		System.out.println("�߻� Ŭ������ final �޼ҵ� ȣ��");
	}
}
