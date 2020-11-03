package bakery;

public class BreadPlate {
	int breadCnt;
	int eatCnt;
	
	private BreadPlate() {;}
	
	// 싱글톤 패턴(Calendar, Desktop)
	// 객체가 단 한 개여야 하는 경우 생성자 호출을 막아주고 객체를 리턴해준다.
	// 리턴한 객체 하나만으로 다른 곳에서 사용하기 때문에 객체는 단 한 개이다.
	public static BreadPlate getBreadPlateInstace() {
		BreadPlate plate = new BreadPlate();
		return plate;
	}
	
	// 멀티 쓰레드 사용시 각 쓰레드를 제어하기 위해서는 동기화를 사용해준다.
	public synchronized void makeBread() {
		if(breadCnt>9) {
			System.out.println("빵이 가득 찼습니다.");
			try {
				wait();
			} catch (InterruptedException e) {
				;
			}
			breadCnt++;
			System.out.println("빵을 1개 만들었습니다. 총:"+breadCnt+"개");
		}
	}
	
	public synchronized void eatBread() {
		if(eatCnt==20) {
			System.out.println("빵이 다 떨어졌습니다.");
		}else if(breadCnt<1) {
			System.out.println("그만 먹으세요");
		}else {
			breadCnt--;
			eatCnt++;
			System.out.println("빵을 1개 먹었습니다. 총:"+breadCnt+"개");
			notify();
		}
	}
}
