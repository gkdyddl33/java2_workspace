package day01;

public class ClassTest {
	public static void main(String[] args) {
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		Drink[] drinks = {j,c,b,w,t};
		
		for(Drink d:drinks) {
			d.ordered();
		}
	}
}
abstract class Drink{
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ� �Ǿ����ϴ�.");
	}
}
class Juice extends Drink{}
class Coffee extends Drink{}
class Beer extends Drink{}
class Water extends Drink{}
class Tea extends Drink{}
