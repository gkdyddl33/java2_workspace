package day13;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		// �� ������ �Է¹ް� �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		String n1Msg = "ù��° ����:";
		String n2Msg = "�ι�° ����:";
		
		System.out.println(n1Msg);
		num1 = Integer.parseInt(sc.next());
		
		System.out.println(n2Msg);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 +num2;
		System.out.printf("%d+%d=%d",num1,num2,result);
	}
}
