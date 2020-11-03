package day0102;

public class Practice {
	public static void main(String[] args) {
		KRW krw = new KRW(1500,"원");
		USD usd = new USD(100.50,"달러");
		EUR eur = new EUR(260.87,"유로");
		JPY jpy = new JPY(1400,"엔");
		
		Currency[] currencies = {krw,usd,eur,jpy};
		for(Currency c : currencies) {
			System.out.println(c.toString());
		}
	}
	public String toString() {
		System.out.println("%s: %.2f %s",this.getClass().getSimpleName(),amount,notation);
	}
}
class Currency{
	private String notation;
	private double amount;
	public Currency(String notation, double amount) {
		super();
		this.notation = notation;
		this.amount = amount;
	}
}

class KRW extends Currency{
	public KRW (double amount,String notation)
	{
		super(amount,notation);
	}
}
class USD extends Currency{
	public USD (double amount,String notation)
	{
		super(amount,notation);
	}
}
class EUR extends Currency{
	public EUR (double amount,String notation)
	{
		super(amount,notation);
	}
}
class JPY extends Currency{
	public JPY (double amount,String notation)
	{
		super(amount,notation);
	}
}