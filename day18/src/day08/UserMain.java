package day08;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User();
		user1.name = "가길동";
		user1.age = 30;
		user1.phone = "010-1234-1234";
		user1.gender = "남자";
		user1.info();
	}
}
class User{
	String name;
	int age;
	String phone;
	String gender;
	
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("전화번호:"+phone);
		System.out.println("성별:"+gender);
	}
}
