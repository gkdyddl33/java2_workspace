package fianltest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		int idx = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++idx+"�� �����Է�");
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[idx-1] = Integer.parseInt(temp);
				System.out.println("�߰� ����");
			} catch (NumberFormatException e) {
				System.out.println("���� �Ǵ� \'q\'�� �Է��ϼ���");
				idx--;
			} catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("�� �̻� ������ �Է¹��� �� �����ϴ�.");
				break;
			}
			
		}
	}
}
