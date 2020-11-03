package methodTest;

import javax.swing.JOptionPane;

public class UserMain {
	public static void main(String[] args) {
		int choice = 0;
		UserField uf = new UserField();
		User user = null;
		
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog("1.회원가입\n2.로그인\n3.나가기"));
			if(choice == 3) {
				break;
			}
			
			switch(chioce) {
			case 1:
				String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
				String pw = JOptionPane.showInputDialog("패스워드를 입력하세요.");
				user = new User(id,pw);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "회원가입 성공");
				}else {	
					JOptionPane.showMessageDialog(null, "회원가입 실패");
				}
				
			case 2 :
				String id2 = JOptionPane.showInputDialog("아이디를 입력하세요.");
				String pw2 = JOptionPane.showInputDialog("패스워드를 입력하세요.");
				user = new User(id2,pw2);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				}else {	
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
			}
		}
	}
}
