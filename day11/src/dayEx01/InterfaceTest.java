package dayEx01;

public class InterfaceTest {
	public static void main(String[] args) {
		Person personPark = new Person("홍팍");
		Student studentPark = personPark;
		
		studentPark.study();
		studentPark.drinkBeer();
	}
}

interface Student{
	void study();
	void drinkBeer();
}

class Person implements Student{
	String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void study() {
		System.out.println(name + "이는 공부중");
		
	}
	
	@Override
	public void drinkBeer() {
		System.out.println(name + "이는 음주중");
		
	}
}