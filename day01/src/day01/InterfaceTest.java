package day01;

public class InterfaceTest {
	public static void main(String[] args) {
		Person personPark = new Person("홍팍");
		Student studentPark = personPark;
		
		studentPark.study();
		studentPark.drinkBeer();
	}
}
interface Student{
	public void study();
	public void drinkBeer();
}
class Person implements Student{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	public void study() {
		System.out.println(name+"이는 공부중!");
	}
	public void drinkBeer() {
		System.out.println(name + "이는 음주중!");
	}
}
