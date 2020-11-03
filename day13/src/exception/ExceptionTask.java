package exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		// 몇번째 정수?
		int idx = 0; 
		
		// 어떤 값인지 모르니? 임시 사용
		String temp = "";
		
		while(true) {
			System.out.println(++idx+"번 정수 입력:");
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			
			// temp != q -> 정수 또는 다른값이 담겨있음.
			try {
				arData[idx-1] = Integer.parseInt(temp);
				System.out.println("추가성공!");
			} catch (NumberFormatException e) {
				// temp != 정수가 아닌 값.
				System.out.println("정수 또는 \'q\'만 입력하세요.");
				idx--;
			} catch(ArrayIndexOutOfBoundsException aiooe) {
				// 배열 초과
				System.out.println("더 이상 정수를 입력받을 수 없습니다.");
				break;
			}
		}
	}
}
