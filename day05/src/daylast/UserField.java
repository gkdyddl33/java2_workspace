package daylast;

import java.util.ArrayList;

public class UserField {
	ArrayList<User> DB = new ArrayList<>();
	
	private final int key = 3;
	
	// �ߺ��˻�
	public User checkDup(String id) {
		// DB�� �� �� �����ϸ� UserŸ���� ��ü�̱� ������
		// ���� for������ temp�� �� ��ü�� ��´�.
		User user = null;
		for(User temp : DB) {
			// �� ��ü�� id�� �ܺο��� ���޹���(����ڰ� �Է���)id�� ���Ѵ�.
			if(temp.id.equals(id)) {
				// ���� �ߺ��� �ִٸ� user�� �ش� ��ü�� ����ش�.
				user = temp;
				break;
			}
		}
		// �ߺ��� ������ ���ϵȴ�. �׷��� null�� ����
		return user;
	}
	// ȸ������
	public boolean join(User user) {
		// �ܺο��� ����ڰ� �Է��� ������  user�� �޴´�.
		boolean check = false;
		if(checkDup(user.id)==null) {
			// checkDup()�� null�� ������ �ߺ��� ���� ���̵��̹Ƿ�
			
			// ��ȣȭ�� �� �� �߰��� �ؾ� �ȴ�. -> ���ȿ� ������ ����� ������
			// ����ڰ� �Է��� pw�� �״�� �����ϸ� ���Ȼ� ������ �߻��ϱ� ������
			// ��ȣȭ �� �������ش�.
			user.pw = encrypt(user.pw); 
			DB.add(user);
			check = true;
		}
		return check;
	}
	// �α���
	public boolean login(String id,String pw) {
		// �ܺο��� ����ڰ� �Է��� id�� pw�� ���޹޴´�.
		boolean check = false;
		// checkDup()�� ������ �� ���� ��ġ�ϴ� id�� �ִٸ� �ش� ��ü�� temp�� ���
		// ���ٸ� null�� temp�� ����.
		User temp = checkDup(id);
		
		// ��ġ�ϴ� ���̵� �ִٸ�(null�� �ƴϸ�) ��
		if(temp != null) {
			// �� �ȿ� ���ٸ� Ʋ���� �׷��� �� �ش� �������� ���� �� ���´�.
			// ���� DB�� ��ȣȭ�� PW�� ��ȭ���� �� ����ڰ� �Է��� pw�� ���Ѵ�.
			if(decrypt(temp.pw).equal(pw)) {
				check = true;
			}
		}
		return check;
	}
	// ��ȣȭ
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i)*key);
		}
		return en_pw;
	}
	// ��ȣȭ
	public String decrypt(String en_pw) {
		String de_pw = "";
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i)/key);
		}
		return de_pw;
	}
}
