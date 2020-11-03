package api;

public class MethodTest {
	// 연습문제
	// 한글을 정수로 변경해주는 메소드
	// 일공이사 > 1024
	
	public int changeToInteger(String hangle) {
		String org_hangle = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < hangle.length(); i++) {
			result += org_hangle.indexOf(hangle.charAt(i));
		}
		
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		System.out.println(new MethodTest().changeToInteger("일이삼사오육칠팔구"));
	}
	
}
