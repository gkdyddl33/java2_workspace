package day01;

public class InterfaceTask {
	Person park = new Person("홍팍");
	
	Developer devPark = park;
	devPark.programming("Java");
	
	Instuctor instPark = park;
	instPark.teach("자료구조");
	
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
		System.out.printf("%s -> %s 프로그래밍중!\n",name,lang);
	}
	public void teach(String subject) {
		System.out.printf("%s -> %s 수업중!\n",name,subject);
	}
	public void massage() {
		System.out.printf("%s -> 마사지중!\n",name);
	}
}