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
		System.out.println(Thread.currentThread().getName()+"이(가)"+money+"원 출금");
		System.out.println("현재잔액:"+this.money+"원");
	}
}
