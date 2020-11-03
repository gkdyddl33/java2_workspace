package day08;

public class Animal implements Runnable{
	String sound;
	
	public Animal() {}

	public Animal(String sound) {
		super();
		this.sound = sound;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(sound);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				;
			}
		}
		
	}
	
}
