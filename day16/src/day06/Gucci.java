package day06;

public class Gucci {
	public static void main(String[] args) {
		String title = "▒GUCCI▒";
		String menu = "①구매하기\n②포인트 조회\n③거래내역\n④나가기";
		
		String errMsg = "다시 시도해주세요.";
		String homeMsg = "메인 메뉴로 이동합니다!";
		
		// 대 카테고리
		String a_category_msg = "①여성\n②남성\n③메인메뉴로 이동";
		
		// 중 카테고리
		String a_Women_b_category_msg ="①핸드백\n②구두\n③메인메뉴로 이동";
		String a_Men_b_category_msg ="①지갑\n②패션소품\n③메인메뉴로 이동";
		
		// 소 카테고리
		// Women
		String a_Women_b_handbag_c_category_msg = "①구찌의 선택\n②미니백\n③메인메뉴로 이동";
		String a_Women_b_shoes_c_category_msg = "①슬리퍼\n②스니커즈\n③메인메뉴로 이동";
		
		// Men
		String a_Men_b_wallet_c_category_msg = "①장지갑&반지갑\n②파우치\n③메인메뉴로 이동";
		String a_Men_b_things_c_category_msg = "①쥬얼리&시계\n②아이웨어\n③메인메뉴로 이동";
		
		// Women List
		String a_b_c_handbagList = "①구찌 1955 홀스빗 버킷백(￦1,940,000)\n②[디오니서스] 스몰 GG 숄더백(￦2,620,000)\n③메인메뉴로 이동";
		String handbag1Name = "구찌 1955 홀스빗 버킷백";
		int handbag1Price = 40_000;
		
		String handbag2Name = "[디오니서스] 스몰 GG 숄더백";
		int handbag2Price = 2_620_000;
		
	}
}
