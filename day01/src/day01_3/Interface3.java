package day01_3;

public class Interface3 {
	public static void main(String[] args) {
		Artist kim = new Artist("������ �达");
		Architect lee = new Architect("���డ �̾�");
		Developer park = new Developer("������ �ھ�");
		Lawyer choi = new Lawyer("��ȭ�� �־�");
		
		Friend[] friends = {kim,lee,park,choi};
		for (Friend f : friends) {
			f.dearFriend();
		}
	}
}
interface Friend{
	public void dearFriend();
}
class Artist implements Friend{
	private String name;

	public Artist(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�����̰�~\n",name);
	}
}

class Architect implements Friend{
	private String name;

	public Architect(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�����̰�~\n",name);
	}
}

class Developer implements Friend{
	private String name;

	public Developer(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�����̰�~\n",name);
	}
}

class Lawyer implements Friend{
	private String name;

	public Lawyer(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�����̰�~\n",name);
	}
}