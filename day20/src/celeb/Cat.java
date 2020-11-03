package celeb;

public class Cat extends Animal{
	
	public Cat() {
		super();
	}
	
	public Cat(String name,int hp,String feed,int feedCnt) {
		super(name,hp,feed,feedCnt);
	}
	
	@Override
	public void sleep() {
		System.out.print("ภฺดย ม฿");
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println();
			hp++;
		}
	}
}
