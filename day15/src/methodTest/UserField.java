package methodTest;

import java.util.ArrayList;

public class UserField {
	ArrayList<User> DB = new ArrayList<>();
	
	private final int KEY = 3;
	
	// 중복검사(회원가입을 위해)
	public User checkDup(String id) {
		User user = null;
		// DB에 한 번 접근하면 User타입의 객체이기 때문에
		// 빠른 for문에서 temp에 각 객체를 담는다.
		
		for(User temp : DB) {
			if(temp.id.equals(id)) {
				user = temp;
				break;
			}
		}
		// 중복이 없다면 -> user(null)에 담긴다.
		return user;
	}
	
	// 회원가입
	// user에 중복이 있는지 없는지 확인해야 되기 때문에
	public boolean join(User user) {
		boolean check = false;
		// 중복없음 확인
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
		User temp = checkDup(id);
		
		if(temp != null) {
			if(decrypt(temp.pw).equals(pw)) {
				check = true;
			}
		}
		return check;
	}
	
	// 암호화
	public String encrypt(String pw) {
		String en_pw="";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i)*KEY);
		}
		return en_pw;
	}
	
	// 복호화
	public String decrypt(String en_pw) {
		String de_pw="";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i)*KEY);
		}
		return de_pw;
	}
	
}
