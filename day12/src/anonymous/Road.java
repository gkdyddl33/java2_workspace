package anonymous;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
		gangnam.regist(new Cafe() {
			
			@Override
			public void sell(String menu) {
				for (int i = 0; i < getMenu().length; i++) {
					if(getMenu()[i].equals(menu)) {
						System.out.println(getMenu()[i]+"�Ǹ� ����!");
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
