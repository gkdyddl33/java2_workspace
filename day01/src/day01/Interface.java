package day01;

public class Interface {
	// 주어진 코드가 컴파일 되지 않는 이유를 찾고,
	// -> 인터페이스의 프로토 타입 메소드를 재정의하지 않았기 때문에
	// 이를 해결하여 출력 예와 같은 결과를 만드시오.
	// -> 새롭게 재정의 해보자!
	public static void main(String[] args) {
		// 객체생성
		Person personPark = new Person("홍팍");
		
		// 객체를 학생의 관점으로 바라봄
		// Person 클래스가 Student 인터페이스의 구현체이므로 가능
		Student studentPark = personPark; // 위에 객체를 대입
		
		// 학생의 본분
		studentPark.study();
		studentPark.drinkBeer();
	}
}

// 학생역할을 인터페이스로 정의
interface Student{
	// 프로토 타입 메소드 = 비어잇는 메소드 -> 재정의를 해야됨
	public void study();
	public void drinkBeer();
}

// 학생의 역할을 부여받은 Person 클래스
class Person implements Student{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	
	// 메소드 재정의 오버라이딩 오류를 해결할 수 있다.
	public void study()
	{
		System.out.println(name+"이는 공부중!");
	}
	public void drinkBeer()
	{
		System.out.println(name+"이는 음주중!");
	}
}