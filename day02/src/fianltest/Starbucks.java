package fianltest;

public class Starbucks {
	String[] menus;
	public void regist(Cafe c) {
		System.out.println("�� ����");
		
		menus = c.getMenu();
		System.out.println("�޴���");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		if(!(c instanceof CafeAdapter)) {
			c.sell("�Ƹ޸�ī��");
		}
		else {
			System.out.println("���ᳪ��!");
		}
	}
}
