package day13;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		System.out.print("�̸�:");
		name = sc.next();
		System.out.println(name + "�� ȯ���մϴ�");
		
		int age = 0;
		System.out.println("����:");
		age = sc.nextInt();
		System.out.println(age + "��");
	}
}
