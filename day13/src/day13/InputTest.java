package day13;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		System.out.print("이름:");
		name = sc.next();
		System.out.println(name + "님 환영합니다");
		
		int age = 0;
		System.out.println("나이:");
		age = sc.nextInt();
		System.out.println(age + "살");
	}
}
