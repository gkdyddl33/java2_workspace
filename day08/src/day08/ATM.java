package day08;

public class ATM implements Runnable{
	int money = 10000;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized(this) {
				withdraw(1000);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				;
			}
		}
		
	}
	
	private void withdraw(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread().getName()+"��(��)"+money+"�� ���");
		System.out.println("�����ܾ�:"+this.money+"��");
	}
}
