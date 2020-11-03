package day08;

public class Zoo {
	public static void main(String[] args) {
		Animal cow = new Animal("����~");
		Animal tiger = new Animal("����~");
		Animal bear = new Animal("��������~");
		
		Thread t_cow = new Thread(cow);
		Thread t_tiger = new Thread(tiger);
		Thread t_bear = new Thread(bear);
		
		t_cow.start();
		t_tiger.start();
		
		try {
			t_cow.join();
			t_tiger.join();
		} catch (InterruptedException e) {
			;
		}
		t_bear.start();
	}
}
