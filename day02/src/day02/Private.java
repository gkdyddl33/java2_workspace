package day02;

public class Private implements Solider{
	// �������̽� -> ������Ÿ�� �޼ҵ� -> ������ ����
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