package daylast;

import java.util.ArrayList;

public class UserField {
	ArrayList<User> DB = new ArrayList<>();
	
	private final int key = 3;
	
	// 중복검사
	public User checkDup(String id) {
		// DB에 한 번 접근하면 User타입의 객체이기 때문에
		// 빠른 for문에서 temp에 각 객체를 담는다.
		User user = null;
		for(User temp : DB) {
			// 각 객체의 id와 외부에서 전달받은(사용자가 입력한)id를 비교한다.
			if(temp.id.equals(id)) {
				// 만약 중복이 있다면 user에 해당 객체를 담아준다.
				user = temp;
				break;
			}
		}
		// 중복이 없으면 리턴된다. 그러면 null에 대입
		return user;
	}
	// 회원가입
	public boolean join(User user) {
		// 외부에서 사용자가 입력한 정보를  user로 받는다.
		boolean check = false;
		if(checkDup(user.id)==null) {
			// checkDup()이 null일 때에는 중복이 없는 아이디이므로
			
			// 암호화가 된 후 추가를 해야 된다. -> 보안에 문제가 생기기 때문에
			// 사용자가 입력한 pw를 그대로 저장하면 보안상 문제가 발생하기 떄문에
			// 암호화 후 저장해준다.
			user.pw = encrypt(user.pw); 
			DB.add(user);
			check = true;
		}
		return check;
	}
	// 로그인
	public boolean login(String id,String pw) {
		// 외부에서 사용자가 입력한 id와 pw를 전달받는다.
		boolean check = false;
		// checkDup()에 전달한 후 만약 일치하는 id가 있다면 해당 객체를 temp에 담고
		// 없다면 null이 temp에 들어간다.
		User temp = checkDup(id);
		
		// 일치하는 아이디가 있다면(null이 아니면) 참
		if(temp != null) {
			// 저 안에 없다면 틀린것 그래서 이 해당 영역에는 맞을 때 들어온다.
			// 기존 DB의 암호화된 PW를 복화한한 후 사용자가 입력한 pw와 비교한다.
			if(decrypt(temp.pw).equal(pw)) {
				check = true;
			}
		}
		return check;
	}
	// 암호화
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i)*key);
		}
		return en_pw;
	}
	// 복호화
	public String decrypt(String en_pw) {
		String de_pw = "";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i)/key);
		}
		return de_pw;
	}
}
