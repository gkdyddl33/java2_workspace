package bakery;

public class BreadMaker implements Runnable{
	BreadPlate plate = BreadPlate.getBreadPlateInstace();
	
	public BreadPlate getPlate() {
		return plate;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			plate.makeBread();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				;
			}
			System.out.println("재료가 소진되었습니다.");
		}
		
	}
}
