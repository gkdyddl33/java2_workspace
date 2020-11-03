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
			System.out.println("아이디가 존재하지 않습니다.");
		}else if(!inputpw.equals(userPw)) {
			System.out.println("비밀번호가 틀립니다.");
		}else {
			System.out.println("로그인 되었습니다.");
		}
	}
}
