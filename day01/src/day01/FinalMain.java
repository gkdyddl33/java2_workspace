package day01;

public class FinalMain extends Parent{
	
	public void show() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		FinalMain main = new FinalMain();
		FinalMain.show();
	}
}
