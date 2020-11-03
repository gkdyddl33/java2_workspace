package bakery;

public class BreadPlate {
	int breadCnt;
	int eatCnt;
	
	private BreadPlate() {;}
	
	// �̱��� ����(Calendar, Desktop)
	// ��ü�� �� �� ������ �ϴ� ��� ������ ȣ���� �����ְ� ��ü�� �������ش�.
	// ������ ��ü �ϳ������� �ٸ� ������ ����ϱ� ������ ��ü�� �� �� ���̴�.
	public static BreadPlate getBreadPlateInstace() {
		BreadPlate plate = new BreadPlate();
		return plate;
	}
	
	// ��Ƽ ������ ���� �� �����带 �����ϱ� ���ؼ��� ����ȭ�� ������ش�.
	public synchronized void makeBread() {
		if(breadCnt>9) {
			System.out.println("���� ���� á���ϴ�.");
			try {
				wait();
			} catch (InterruptedException e) {
				;
			}
			breadCnt++;
			System.out.println("���� 1�� ��������ϴ�. ��:"+breadCnt+"��");
		}
	}
	
	public synchronized void eatBread() {
		if(eatCnt==20) {
			System.out.println("���� �� ���������ϴ�.");
		}else if(breadCnt<1) {
			System.out.println("�׸� ��������");
		}else {
			breadCnt--;
			eatCnt++;
			System.out.println("���� 1�� �Ծ����ϴ�. ��:"+breadCnt+"��");
			notify();
		}
	}
}
