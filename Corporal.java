package interTest;

// ��
public class Corporal implements Solider {

	@Override
	public void eat() {
		System.out.println("��ġ�� ���� �Ļ��Ѵ�.");

	}

	@Override
	public void sleep() {
		System.out.println("���� ���ܴ�.�׸��� ���ӵ�� ��å����.");

	}

	@Override
	public void work() {
		System.out.println("���ӵ鿡�� ���� �˷��ش�.");

	}

	@Override
	public void salute() {
		System.out.println("����");

	}

}
