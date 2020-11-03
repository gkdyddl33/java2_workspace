package methodTest;

import java.util.ArrayList;

public class UserField {
	ArrayList<User> DB = new ArrayList<>();
	
	private final int KEY = 3;
	
	// �ߺ��˻�(ȸ�������� ����)
	public User checkDup(String id) {
		User user = null;
		// DB�� �� �� �����ϸ� UserŸ���� ��ü�̱� ������
		// ���� for������ temp�� �� ��ü�� ��´�.
		
		for(User temp : DB) {
			if(temp.id.equals(id)) {
				user = temp;
				break;
			}
		}
		// �ߺ��� ���ٸ� -> user(null)�� ����.
		return user;
	}
	
	// ȸ������
	// user�� �ߺ��� �ִ��� ������ Ȯ���ؾ� �Ǳ� ������
	public boolean join(User user) {
		boolean check = false;
		// �ߺ����� Ȯ��
		if(checkDup(user.id)==null) {
			user.pw = encrypt(user.pw);
			DB.add(user);
			check = true;
		}
		return check;
	}
	
	// �α���
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
	
	// ��ȣȭ
	public String encrypt(String pw) {
		String en_pw="";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i)*KEY);
		}
		return en_pw;
	}
	
	// ��ȣȭ
	public String decrypt(String en_pw) {
		String de_pw="";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i)*KEY);
		}
		return de_pw;
	}
	
}
