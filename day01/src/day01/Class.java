package day01;

public class Class {
	// 추상클래스 Drink를 작성하시오.
	// 상속을 통해 중복코드를 줄일 것
	public static void main(String[] args) {
		// 서로 다른 객체 생성
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		//추상 클래스를 통한 그룹화
		Drink[] drinks = {j,c,b,w,t};
		
		// 그룹화된 객체들의 주문 결과 출력
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

// (1) 추상클래스를 추가할 것.
abstract class Drink{
		String name;
		double price;
		public void ordered() 
		{
			System.out.println("주문 되엇습니다.");
		}	
}
//(2) 상속을 통해 중복코드를 줄였음.
class Juice extends Drink {}
class Coffee extends Drink {}
class Beer extends Drink {}
class Water extends Drink {}
class Tea extends Drink {}