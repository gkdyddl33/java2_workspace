package day08;

public class ClassMain {
	public static void main(String[] args) {
		A a = new A();
		a.x = 20;
		System.out.println(a.x);
		a.f1();
	}
}
class A{
	int x = 3;
	public static void f1() {
		System.out.println("A.f1()");
	}
}
