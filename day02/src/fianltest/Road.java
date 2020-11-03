package fianltest;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnum = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
		gangnam.regist(new Cafe() {
			public void sell(String menu) {
				for (int i = 0; i < getMenu().length; i++) {
					if(getMenu()[i].equals(menu)) {
						System.out.println(getMenu()[i]+"�Ǹż���!");
					}
				}
			}
			@Override
			public String[] getMenu() {
				String[] menus = {"ī���","�Ƹ޸�ī��","��"};
				return menus;
			}
		});
		
		jamsil.regist(new CafeAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = {"ī���","�Ƹ޸�ī��","��"};
				return menus;
			}
		});
	}
}
