package day01_3;

public class Interface2 {
	Person park = new Person("홍팍");
	
	Developer devPark = park;
	devPark.programming("Java");
	
	Instructor instPark = park;
	instPark.teach("자료구조");
	
	Masseur masPark = park;
	masPark.massage();
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
class Person implements Developer,Instructor,Masseur {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	public void teach(String lang) {
		System.out.printf("%s -> %s 프로그래밍중!\n",name,lang);
	}
	public void programming(String subject) {
		System.out.printf("%s -> %s 수업중!\n",name,subject);
	}
	public void massage() {
		System.out.printf("%s -> 마사지중!\n",name);
	}
}