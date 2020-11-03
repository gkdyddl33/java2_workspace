package thread;

public class ThreadTest {
	public static void main(String[] args) {
		// (1)
//		Thread1 th1 = new Thread1("★");
//		Thread1 th2 = new Thread1("♥");
//		
//		th1.start();
//		th2.start();
//		
//		th1.run();
//		th2.run();

		//(2)
		Thread2 th1 = new Thread2("?");
		Thread2 th2 = new Thread2("!");
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			;
		}
		System.out.println("메인 쓰레드 종료");
	}
}
