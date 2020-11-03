package day0101;

import java.util.Currency;

public class Practice {
	// 각국 통화 화폐
	// 클래스 다이어 그램을 구현하여 출력예와 결과를 얻으시오.
	//		Currency     -> extends
	//  krw usd eur jpy
	
	public static void main(String[] args) {
		// 객체생성
		KRW krw = new KRW(1500,"원");
		USD usd = new USD(100.50,"달러");
		EUR eur = new EUR(260.87,"유로");
		JPY jpy = new JPY(1400,"엔");
		
		Currency[] currencies = {krw,usd,eur,jpy};
		
		for(Currency c : Currencies)
		{
			System.out.println(c.toString());
		}
	}
	// 3. toString() 메소드 오버라이딩
	// 구글링 : "자바 Object toString 메소드"
	public String toString() {
		// 객체의 특성 클래스를 첫번째 this코드가 가져온다.
		return String.format("%s:%.2f %s",this.getClass().getSimpleName(),amount,natation );
	}
}
// 1. 부모클래스 작성
class Currency{
	//1. 중복필드를 작성
	private double amount; 		// 수량
	private String natation;	//표기법
	
	//2. 생성자를 작성
	public Currency(double amount,String natation)
	{
		this.amount = amount;
		this.natation = natation;
	}
}

//2. 자식클래스가 부모클래스 상속

class KRW extends Currency{
	
	public KRW(double amount, String natation) {
		super(amount,natation);
	}
}

class USD extends Currency{
	
	public USD(double amount, String natation) {
		super(amount,natation);
	}
}
class EUR extends Currency{
	
	public EUR(double amount, String natation) {
		super(amount,natation);
	}
}
class JPY extends Currency{
	
	public JPY(double amount, String natation) {
		super(amount,natation);
	}
}