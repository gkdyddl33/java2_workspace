package day05;

import java.util.ArrayList;

public class UserField2 {
	ArrayList<User2> DB = new ArrayList<>();
	private final int KEY = 3;
	// 중복검사
	public User2 checkDup(String id) {
		User2 user = null;
		for(User2 temp : DB) {
			if(temp.id.equals(id)) {
				user = temp;
				break;
			}
		}
		return user;
	}
	// 회원가입
	public boolean join(User2 user) {
		boolean check = false;
		if(checkDup(user.id)==null) {
			user.pw = encrypt(user.pw);
			DB.add(user);
			check = true;
		}
		return check;
	}
	// 로그인
	public boolean login(String id,String pw) {
		boolean check = false;
		User2 temp = checkDup(id);
		if(temp != null) {
			if(decrypt(temp.pw).equals(pw)) {
				check = true;
			}
		}
		return check;
	}
	// 암호화
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i)*KEY);
		}
		return en_pw;
	}
	// 복호화
	public String decrypt(String en_pw) {
		String de_pw = "";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i)/KEY);
		}
		return de_pw;
	}
}
