package dayEx01;

public class InterfaceTask {
	public static void main(String[] args) {
		Person park = new Person("ȫ��");
		
		Developer devPark = park;
		devPark.programming("Java");
		
		Instructor instPark = park;
		instPark.teach("�ڷᱸ��");
		
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
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void programming(String lang) {
		System.out.printf("%s -> %s ���α׷�����\n",name,lang);
		
	}
	@Override
	public void teach(String subject) {
		System.out.printf("%s -> %s ������\n",name,subject);
		
	}
	@Override
	public void massage() {
		System.out.printf("%s -> ��������\n",name);
		
	}
}