package day07;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ArTask {
	public static void main(String[] args) {
		// (1) 1~100���� �迭�� �ְ� ���
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			System.out.println(arData[i]);
//		}
		
		// (2) 1~100���� �� ¦���� �迭�� �ְ� ���
//		int[] arData = new int[50];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (i+1)*2;
//			System.out.println(arData[i]);
//		}
		
		// (3) A~F���� �迭�� �ְ� ���
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i+65);
//			System.out.println(arData[i]);
//		}
		
//		String arData = "ABCDEF";
//		System.out.println(arData.length());
//		System.out.println(arData.charAt(0));
//		System.out.println(arData);
		
		// (4) A~F���� �� C �����ϰ� �迭�� �ְ� ���
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
		
		// (5) 5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arData = null;
//		int size = 0;
//		System.out.print("������ �Է��ϼ���:");
//		size = sc.nextInt();
//		String result = "";
//		
//		int max = 0;
//		int min = 0;
//		arData = new int[size];
//		
//		result += "[";
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i+1+"��° ����:");
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
//		System.out.println("�ִ�:"+max);
//		System.out.println("�ּҰ�:"+min);
		
		// (6) ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �����ϱ�
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		String result = "";
//		System.out.print("���� �Է�:");
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
		
		// (7) ������ �ѱ۷� �ٲ��ֱ� -> �Է� ��) 1024 ->  �ϰ��̻�
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0;
//		System.out.println("���� �Է�:");
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
		
		System.out.println("�����Է�:");
		data = sc.nextInt()+"";
		
		String hangle = "�����̻�����ĥ�ȱ�";
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(i)-48;
		}
		System.out.println(result);
	}
}
