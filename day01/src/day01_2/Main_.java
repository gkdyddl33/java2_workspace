package day01_2;

// �������̽��� ��ӹ޴´�.
public class Main_ implements Dog_{
	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.show();
	}
	
	@Override
	public void crying() {
		System.out.println("��!��!");
	}

	@Override
	public void show() {
		System.out.println("hello world!");
	}
}
