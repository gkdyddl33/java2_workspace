package day07;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ArTask {
	public static void main(String[] args) {
		// (1) 1~100까지 배열에 넣고 출력
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			System.out.println(arData[i]);
//		}
		
		// (2) 1~100까지 중 짝수만 배열에 넣고 출력
//		int[] arData = new int[50];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (i+1)*2;
//			System.out.println(arData[i]);
//		}
		
		// (3) A~F까지 배열에 넣고 출력
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i+65);
//			System.out.println(arData[i]);
//		}
		
//		String arData = "ABCDEF";
//		System.out.println(arData.length());
//		System.out.println(arData.charAt(0));
//		System.out.println(arData);
		
		// (4) A~F까지 중 C 제외하고 배열에 넣고 출력
//		char[] arData = new char[5];
//		int temp = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(i>1) {
//				temp++;
//			}
//			arData[i] = (char)(temp+65);
//			System.out.println(arData[i]);
//		}
		
		// (5) 5개의 정수를 입력받고 배열에 넣은 후 최대값과 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arData = null;
//		int size = 0;
//		System.out.print("정수를 입력하세요:");
//		size = sc.nextInt();
//		String result = "";
//		
//		int max = 0;
//		int min = 0;
//		arData = new int[size];
//		
//		result += "[";
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"번째 정수:");
//			arData[i] = sc.nextInt();
//			result += i == size-1 ? arData[i] : arData[i]+",";
//		}
//		result += "]";
//		System.out.println(result);
//		
//		max = arData[0];
//		min = arData[0];
//		for (int i = 0; i < arData.length; i++) {
//			if(max<arData[i]) {
//				max = arData[i];
//			}
//			if(min>arData[i]) {
//				min = arData[i];
//			}
//		}
//		System.out.println("최댓값:"+max);
//		System.out.println("최소값:"+min);
		
		// (6) 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 변경하기
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		String result = "";
//		System.out.print("영어 입력:");
//		str = sc.nextLine();
//		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if(c>=97&&c<=122) {
//				result += (char)(c-32);
//			}
//			else if(c>=65&&c<=92) {
//				result += (char)(c+32);
//			}
//			else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		
		// (7) 정수를 한글로 바꿔주기 -> 입력 예) 1024 ->  일공이사
//		String hangle = "공일이삼사오육칠팔구";
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		System.out.println("정수 입력:");
//		num = sc.nextInt();
//		
//		while(num != 0) {
//			result = hangle.charAt(num%10)+result;
//			num /= num /10;
//		}
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		String data = null;
		String result = "";
		
		System.out.println("정수입력:");
		data = sc.nextInt()+"";
		
		String hangle = "공일이삼사오육칠팔구";
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(i)-48;
		}
		System.out.println(result);
	}
}
