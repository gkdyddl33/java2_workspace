package day09;

import java.util.concurrent.SynchronousQueue;

public class MyClassMain {
	public static void main(String[] args) {
		TestA ta = new TestA(10,20,30);
		TestA ta2 = new TestA();
		
		ta.a=20;
		ta.b=30;
		ta.c=40;
		System.out.println(ta.a);
		System.out.println(ta.b);
		System.out.println(ta.c);
		
		
	}
}
class TestA{
	static int a;
	int b;
	int c;
	
	TestA(){
		System.out.println("TestA() ����Ʈ ������ ȣ��");
	}

	public TestA(int a,int b, int c) {
		System.out.println("TestA() �Ű����� ������ ȣ��");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void f1() {
		System.out.println("f1()");
	}
	void f2() {
		System.out.println("f2()");
	}
}
