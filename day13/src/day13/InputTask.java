package day13;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		// 두 정수를 입력받고 합 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		String n1Msg = "첫번째 정수:";
		String n2Msg = "두번째 정수:";
		
		System.out.println(n1Msg);
		num1 = Integer.parseInt(sc.next());
		
		System.out.println(n2Msg);
		num2 = Integer.parseInt(sc.next());
		
		result = num1 +num2;
		System.out.printf("%d+%d=%d",num1,num2,result);
	}
}
