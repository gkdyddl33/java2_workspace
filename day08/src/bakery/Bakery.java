package bakery;

import java.awt.Desktop;
import javax.swing.ImageIcon;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		Desktop desk = Desktop.getDesktop();
		
		BreadMaker maker = new BreadMaker();
		
		// ����� ��(makeBread()) ��ü���� �Ծ���ϱ� ������(eatBread())
		// ��ü�� �����ϱ� ���ؼ� ���޹޴´�.
		BreadPlate plate = maker.getPlate();
		Thread making = new Thread(maker);
		
		String[] menus = {"���Ա�","�� �Ծ����"};
		int choice = 0;
		
		// png, jpg,.... 
		// gif : �����̴� �׸�
		ImageIcon icon = new ImageIcon("src/img/main.gif");
		
		making.start();
		while(true) {
			choice = JOptionPane.showOptionDialog(
					null, "", "�ĸ��ٰ�Ʈ", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, icon, menus, null);
			
			if(choice == 1 || choice == -1) {System.exit(0);}
			
			plate.eatBread();
		}
	}
}
