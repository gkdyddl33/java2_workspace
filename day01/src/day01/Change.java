package day01;

public class Change {
		public static void main(String[] args) {
			Person park = new Person("���Ͽ�");
			Developer devPark = park;
			devPark.programming("Java");
			
			Instructor isntPark = park;
			isntPark.teach("�ڷᱸ��");
			
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
		System.out.printf("%s -> ��������\n",name);
		
	}

	@Override
	public void teach(String subject) {
		System.out.printf("%s -> %s ������\n",name,subject);
		
	}

	@Override
	public void programming(String lang) {
		System.out.printf("%s -> %s ���α׷�����\n",name,lang);
		
	}
}
