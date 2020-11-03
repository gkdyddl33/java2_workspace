package day0102;

public class Main implements Dog{
	public static void main(String[] args) {
		Main main = new Main();
		main.crying();
		main.show();
	}
	@Override
	public void crying() {
		System.out.println("¿ù!¿ù!");
		
	}
	@Override
	public void show() {
		System.out.println("hello world!");
		
	}
}
