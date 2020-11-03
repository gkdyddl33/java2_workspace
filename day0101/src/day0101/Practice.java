package day0101;

import java.util.Currency;

public class Practice {
	// ���� ��ȭ ȭ��
	// Ŭ���� ���̾� �׷��� �����Ͽ� ��¿��� ����� �����ÿ�.
	//		Currency     -> extends
	//  krw usd eur jpy
	
	public static void main(String[] args) {
		// ��ü����
		KRW krw = new KRW(1500,"��");
		USD usd = new USD(100.50,"�޷�");
		EUR eur = new EUR(260.87,"����");
		JPY jpy = new JPY(1400,"��");
		
		Currency[] currencies = {krw,usd,eur,jpy};
		
		for(Currency c : Currencies)
		{
			System.out.println(c.toString());
		}
	}
	// 3. toString() �޼ҵ� �������̵�
	// ���۸� : "�ڹ� Object toString �޼ҵ�"
	public String toString() {
		// ��ü�� Ư�� Ŭ������ ù��° this�ڵ尡 �����´�.
		return String.format("%s:%.2f %s",this.getClass().getSimpleName(),amount,natation );
	}
}
// 1. �θ�Ŭ���� �ۼ�
class Currency{
	//1. �ߺ��ʵ带 �ۼ�
	private double amount; 		// ����
	private String natation;	//ǥ���
	
	//2. �����ڸ� �ۼ�
	public Currency(double amount,String natation)
	{
		this.amount = amount;
		this.natation = natation;
	}
}

//2. �ڽ�Ŭ������ �θ�Ŭ���� ���

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