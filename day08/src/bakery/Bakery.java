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
		
		// 만드는 빵(makeBread()) 객체에서 먹어야하기 때문에(eatBread())
		// 객체를 공유하기 위해서 전달받는다.
		BreadPlate plate = maker.getPlate();
		Thread making = new Thread(maker);
		
		String[] menus = {"빵먹기","다 먹었어요"};
		int choice = 0;
		
		// png, jpg,.... 
		// gif : 움직이는 그림
		ImageIcon icon = new ImageIcon("src/img/main.gif");
		
		making.start();
		while(true) {
			choice = JOptionPane.showOptionDialog(
					null, "", "파리바게트", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, icon, menus, null);
			
			if(choice == 1 || choice == -1) {System.exit(0);}
			
			plate.eatBread();
		}
	}
}
