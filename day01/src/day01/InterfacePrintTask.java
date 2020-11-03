package day01;

public class InterfacePrintTask {
	public static void main(String[] args) {
		Artist kim = new Artist("������ �达");
		Architect lee = new Architect("���డ �̾�");
		Developer park = new Developer("������ �ھ�");
		Lawyer choi = new Lawyer("��ȣ�� �־�");
		
		Friend[] friends = {kim,lee,park,choi};
		for(Friend f : friends) {
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
		super();
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�� ���̰�!\n",name);
	}
}
class Architect implements Friend{
	private String name;

	public Architect(String name) {
		super();
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�� ���̰�!\n",name);
	}
}
class Developer implements Friend{
	private String name;

	public Developer(String name) {
		super();
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�� ���̰�!\n",name);
	}
}
class Lawyer implements Friend{
	private String name;

	public Lawyer(String name) {
		super();
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> Ī�� ���̰�!\n",name);
	}
}