package day05;

import javax.swing.JOptionPane;

public class UserMain2 {
	public static void main(String[] args) {
		int choice = 0;
		UserField2 uf = new UserField2();
		User2 user = null;
		
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog("1.ȸ������\n2.�α���\n3.������"));
			
			if(choice==3) {
				break;
			}
			
			switch(choice) {
			case 1:
				String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
				String pw = JOptionPane.showInputDialog("�н����带 �Է��ϼ���.");
				user = new User2(id,pw);
				
				if(uf.join(user)) {
					JOptionPane.showMessageDialog(null, "ȸ������ ����");
				}else {	
					JOptionPane.showMessageDialog(null, "ȸ������ ����");
				}
			case 2:
				// �α���
					String id = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
					String pw = JOptionPane.showInputDialog("�н����带 �Է��ϼ���.");
					user = new User2(id,pw);
					
					if(uf.join(user)) {
						JOptionPane.showMessageDialog(null, "�α��� ����");
					}else {	
						JOptionPane.showMessageDialog(null, "�α��� ����");
					}	
			}
		}
	}
}
