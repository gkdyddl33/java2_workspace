package day01;

public class Class {
	// �߻�Ŭ���� Drink�� �ۼ��Ͻÿ�.
	// ����� ���� �ߺ��ڵ带 ���� ��
	public static void main(String[] args) {
		// ���� �ٸ� ��ü ����
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		//�߻� Ŭ������ ���� �׷�ȭ
		Drink[] drinks = {j,c,b,w,t};
		
		// �׷�ȭ�� ��ü���� �ֹ� ��� ���
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

// (1) �߻�Ŭ������ �߰��� ��.
abstract class Drink{
		String name;
		double price;
		public void ordered() 
		{
			System.out.println("�ֹ� �Ǿ����ϴ�.");
		}	
}
//(2) ����� ���� �ߺ��ڵ带 �ٿ���.
class Juice extends Drink {}
class Coffee extends Drink {}
class Beer extends Drink {}
class Water extends Drink {}
class Tea extends Drink {}