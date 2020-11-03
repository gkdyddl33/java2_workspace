package fianltest;

public class Starbucks {
	String[] menus;
	public void regist(Cafe c) {
		System.out.println("축 개업");
		
		menus = c.getMenu();
		System.out.println("메뉴판");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		if(!(c instanceof CafeAdapter)) {
			c.sell("아메리카노");
		}
		else {
			System.out.println("무료나눔!");
		}
	}
}
