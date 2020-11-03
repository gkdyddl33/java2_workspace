package day01;

public class Change {
		public static void main(String[] args) {
			Person park = new Person("강하영");
			Developer devPark = park;
			devPark.programming("Java");
			
			Instructor isntPark = park;
			isntPark.teach("자료구조");
			
			Masseur masPark = park;
			masPark.massage();
		}
}
interface Developer{
	void programming(String lang);
}
interface Instructor{
	void teach(String subject);
}
interface Masseur{
	void massage();
}
class Person implements Developer,Instructor,Masseur{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void massage() {
		System.out.printf("%s -> 마사지중\n",name);
		
	}

	@Override
	public void teach(String subject) {
		System.out.printf("%s -> %s 수업중\n",name,subject);
		
	}

	@Override
	public void programming(String lang) {
		System.out.printf("%s -> %s 프로그래밍중\n",name,lang);
		
	}
}
