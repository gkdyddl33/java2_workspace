package day08;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User();
		user1.name = "���浿";
		user1.age = 30;
		user1.phone = "010-1234-1234";
		user1.gender = "����";
		user1.info();
	}
}
class User{
	String name;
	int age;
	String phone;
	String gender;
	
	public void info() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("��ȭ��ȣ:"+phone);
		System.out.println("����:"+gender);
	}
}
