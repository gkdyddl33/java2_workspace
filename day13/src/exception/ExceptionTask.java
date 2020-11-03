package exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		// ���° ����?
		int idx = 0; 
		
		// � ������ �𸣴�? �ӽ� ���
		String temp = "";
		
		while(true) {
			System.out.println(++idx+"�� ���� �Է�:");
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			
			// temp != q -> ���� �Ǵ� �ٸ����� �������.
			try {
				arData[idx-1] = Integer.parseInt(temp);
				System.out.println("�߰�����!");
			} catch (NumberFormatException e) {
				// temp != ������ �ƴ� ��.
				System.out.println("���� �Ǵ� \'q\'�� �Է��ϼ���.");
				idx--;
			} catch(ArrayIndexOutOfBoundsException aiooe) {
				// �迭 �ʰ�
				System.out.println("�� �̻� ������ �Է¹��� �� �����ϴ�.");
				break;
			}
		}
	}
}
