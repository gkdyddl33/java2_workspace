package interTest;

// 2� = �����̶�� Ʋ �ȿ� �ִ� �޼ҵ�
public class Private implements Solider { // �ڹٿ����� ���߻���� ������ -> �������̽������� ����! solider,...����

	// Ÿ���� �ϳ� �� ����� ���� �� ���
	// ex) Solider sd = new Private(); = new�� ������ �߱� ������ �� �ֱ� ����!!!!
	// �Ʒ�ó�� Ʋ�� ������ �ִ� ���� interface
	// �߻�޼ҵ尡 ������ �ȵǾ� �ִٸ� ������ ��
	
	@Override
	public void eat() {
		System.out.println("�㸮�� 90���� ��� �Ļ��Ѵ�.�׷��� ��� ����.");		
	}

	@Override
	public void sleep() {
		System.out.println("���� ������ ���� �� �ȿ´�.�׷��� ��� ����.");		
	}

	@Override
	public void work() {
		System.out.println("������ ������ ����� ���� �ʴ�.�׷��� ��� ����.");		
	}

	@Override
	public void salute() {
		System.out.println("��!!!!!!!!!!!!!!!��!!!!!!!!!!!!!!!");		
	}
	
	
}
