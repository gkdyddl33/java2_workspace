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
		
		System.out.print("첫번째 수:");
		int a = sc.nextInt();
		
		System.out.print("두번째 수:");
		int b = sc.nextInt();
		
		System.out.println("두 수의 합:"+(a+b));
	}
}
