package day08;

import java.util.Scanner;

public class LoginMethod {
	public static void main(String[] args) {
		Login();
	}
	public static void Login() {
		Scanner sc = new Scanner(System.in);
		
		String inputid,inputpw;
		String userId = "test";
		String userPw = "1234";
		
		System.out.print("ID:");
		inputid = sc.next();
		
		System.out.print("PW:");
		inputpw = sc.next();
		
		if(!inputid.equals(userId)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}else if(!inputpw.equals(userPw)) {
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}else {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
	}
}
