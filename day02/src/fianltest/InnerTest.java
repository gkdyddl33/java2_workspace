package fianltest;

class Out{
	private int OutData = 100;
	
	public Out(){System.out.println("�ܺ� ������ ȣ��");}
	public void printOutData() {
		System.out.println(OutData);
	}
	
	class In{
		private int inData = 50;
		public In() {
			super();
			System.out.println("���� ������ ȣ��");
		}
		public void printTest() {
			OutData = 99;
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
