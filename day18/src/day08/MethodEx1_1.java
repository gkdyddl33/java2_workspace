package day08;

import java.util.Scanner;

public class MethodEx1_1 {
	public static void main(String[] args) {
//		System.out.println(sum(1,2));
		sum2();
	}
	
	// (1)
//	public static int sum(int a,int b) {
//		return a+b;
//	}
	
	// (2)
	public static void sum2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ��:");
		int a = sc.nextInt();
		
		System.out.print("�ι�° ��:");
		int b = sc.nextInt();
		
		System.out.println("�� ���� ��:"+(a+b));
	}
}
