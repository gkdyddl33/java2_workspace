package day01;

public class Interface2 {
	// 3������ ����(������,����,��������)�� ������ �ִ�.
	// 3���� ���� �� �� �ֵ��� �����ض�.
	public static void main(String[] args) {
		
		// Person ��ü ����
		Person park = new Person("ȫ��");
		
		//�����ڷμ� ����
		Developer devPark = park;
		devPark.programming("Java");
		
		//����� ����
		Instructor instPark = park;
		instPark.teach("�ڷᱸ��");
		
		//��������� ����
		Masseur masPark = park;
		masPark.massage();
	}
}

interface Developer{
	public void programming(String lang);
}
interface Instructor{
	public void teach(String subject);
}
interface Masseur{
	public void massage();
}

// ����ü Ŭ���� 
class Person implements Developer, Instructor, Masseur{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	
	// �������̽� ������Ÿ�� �޼ҵ���� �������̵� �Ͻÿ�.
	public void programming(String lang) {
		System.out.printf("%s -> %s ���α׷�����!\n",name,lang);
	}
	public void teach(String subject) {
		System.out.printf("%s -> %s ������!\n",name,subject);
	}
	public void massage() {
		System.out.printf("%s -> ��������!\n",name);
	}
}