package inner;

class Out{

	private int outData = 100;
	public Out() {
		System.out.println("�ܺ� ������ ȣ��!");
	}
	
	public void printOutData() {
		System.out.println(outData);
	}
	
	// ����Ŭ����
	class In{
		private int inData = 50;
		public In() {
			super();
			System.out.println("���� ������ ȣ��!");
		}
		public void printTest() {
			outData = 99;
			printOutData();
			System.out.println(inData);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		
		in.printTest();
	}
}
