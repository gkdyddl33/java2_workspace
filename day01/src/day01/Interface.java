package day01;

public class Interface {
	// �־��� �ڵ尡 ������ ���� �ʴ� ������ ã��,
	// -> �������̽��� ������ Ÿ�� �޼ҵ带 ���������� �ʾұ� ������
	// �̸� �ذ��Ͽ� ��� ���� ���� ����� ����ÿ�.
	// -> ���Ӱ� ������ �غ���!
	public static void main(String[] args) {
		// ��ü����
		Person personPark = new Person("ȫ��");
		
		// ��ü�� �л��� �������� �ٶ�
		// Person Ŭ������ Student �������̽��� ����ü�̹Ƿ� ����
		Student studentPark = personPark; // ���� ��ü�� ����
		
		// �л��� ����
		studentPark.study();
		studentPark.drinkBeer();
	}
}

// �л������� �������̽��� ����
interface Student{
	// ������ Ÿ�� �޼ҵ� = ����մ� �޼ҵ� -> �����Ǹ� �ؾߵ�
	public void study();
	public void drinkBeer();
}

// �л��� ������ �ο����� Person Ŭ����
class Person implements Student{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	
	// �޼ҵ� ������ �������̵� ������ �ذ��� �� �ִ�.
	public void study()
	{
		System.out.println(name+"�̴� ������!");
	}
	public void drinkBeer()
	{
		System.out.println(name+"�̴� ������!");
	}
}