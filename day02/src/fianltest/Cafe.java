package fianltest;

public interface Cafe {
	//신규지점 오픈 시 메뉴판 가져오기
	public String[] getMenu();
	//신규 지점의 판매 방식
	public void sell(String menu);
}
