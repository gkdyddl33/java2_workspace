package methodTest;

import javax.swing.JOptionPane;

public class UserMain {
	public static void main(String[] args) {
		int choice = 0;
		UserField uf = new UserField();
		User user = null;
		
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog("1.ȸ������\n2.�α���\n3.������"));
			if(choice == 3) {
				break;
			}
			
			switch(chioce) {
			case 1:
				String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
				String pw = JOptionPane.showInputDialog("�н����带 �Է��ϼ���.");
				user = new User(id,pw);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "ȸ������ ����");
				}else {	
					JOptionPane.showMessageDialog(null, "ȸ������ ����");
				}
				
			case 2 :
				String id2 = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
				String pw2 = JOptionPane.showInputDialog("�н����带 �Է��ϼ���.");
				user = new User(id2,pw2);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}else {	
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
			}
		}
	}
}
