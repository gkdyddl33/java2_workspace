package day01_2;

// 인터페이스를 상속받는다.
public class Main_ implements Dog_{
	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.show();
	}
	
	@Override
	public void crying() {
		System.out.println("월!월!");
	}

	@Override
	public void show() {
		System.out.println("hello world!");
	}
}
