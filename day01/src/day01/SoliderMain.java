package day01;

public class SoliderMain {
	// ���忡�� 2���� �޼ҵ常 ����ϰ� �� ������
	// ã�ƺ���.
	public static void main(String[] args) {
		Private two = new Private();
		Corporal one = new Corporal();
		Sergent top = new Sergent() { //�͸�Ŭ����

			@Override
			public void work() {
				System.out.println("���ְ� �Դ´�.");
				
			}

			@Override
			public void salute() {
				System.out.println("���ᵵ �ڸ鼭 �� �ܴ�.");
				
			}
			
		};
		two.eat();
		two.sleep();
		top.work();
		top.salute();
	}
}
