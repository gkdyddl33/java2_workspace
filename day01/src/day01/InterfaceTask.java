package day01;

public class InterfaceTask {
	Person park = new Person("ȫ��");
	
	Developer devPark = park;
	devPark.programming("Java");
	
	Instuctor instPark = park;
	instPark.teach("�ڷᱸ��");
	
	Masseur masPark = park;
	masPark.massage();
}
interface Developer{
	public void programming(String lang);
}
interface Instuctor{
	public void teach(String subject);
}
interface Masseur{
	public void massage();
}

class Person implements Developer,Instuctor,Masseur{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
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