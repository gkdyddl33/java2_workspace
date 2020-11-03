package day05;

import javax.swing.JOptionPane;

public class UserMain2 {
	public static void main(String[] args) {
		int choice = 0;
		UserField2 uf = new UserField2();
		User2 user = null;
		
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog("1.회원가입\n2.로그인\n3.나가기"));
			
			if(choice==3) {
				break;
			}
			
			switch(choice) {
			case 1:
				String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
				String pw = JOptionPane.showInputDialog("패스워드를 입력하세요.");
				user = new User2(id,pw);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "회원가입 성공");
				}else {	
					JOptionPane.showMessageDialog(null, "회원가입 실패");
				}
			case 2:
				// 로그인
					String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
					String pw = JOptionPane.showInputDialog("패스워드를 입력하세요.");
					user = new User2(id,pw);
					
					if(uf.join(user)) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
					}else {	
						JOptionPane.showMessageDialog(null, "로그인 실패");
					}	
			}
		}
	}
}
