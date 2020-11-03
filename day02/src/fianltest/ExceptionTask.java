package fianltest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		int idx = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++idx+"번 정수입력");
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[idx-1] = Integer.parseInt(temp);
				System.out.println("추가 성공");
			} catch (NumberFormatException e) {
				System.out.println("정수 또는 \'q\'만 입력하세요");
				idx--;
			} catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("더 이상 정수를 입력받을 수 없습니다.");
				break;
			}
			
		}
	}
}
