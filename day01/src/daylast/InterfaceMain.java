package daylast;

public class InterfaceMain {
	public static void main(String[] args) {
		Person personPark = new Person("홍팍");
		Student studentPark = personPark;
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
	
	@Override
	public void study() {
		System.out.println(name+"이는 공부중!");
	}
	@Override
	public void drinkBeer() {
		System.out.println(name+"이는 음주중!");	
	}
}