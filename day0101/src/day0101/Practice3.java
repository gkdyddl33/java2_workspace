package day0101;

public class Practice3 {
	// ���� �ʰ��� ������ �����Ѵ�.
	//	Healor	Tanker	Sorcerer	-> interface
	//			Knight				-> extends, implements
	//	HolyKnight		MagicKnight	-> concrete class
	public static void main(String[] args) {
		// �� ���� ����
		Knight uther = new HolyKnight("�켭",200,10);
		Knight arthas = new MagicKnight("�Ƽ���",150,8);
		// �켭:��� ����
		uther.increaseHp();
		uther.increaseArmor();
		
		// �켭:����� ����
		HolyKnight holyUther = (HolyKnight) uther;
		holyUther.healingAura();
		holyUther.holyArmor();
		// �Ƽ���:��� ����
		arthas.increaseHp();
		arthas.increaseArmor();
		// �Ƽ���:���˻� ����
		MagicKnight magicArthas = (MagicKnight) arthas;
		magicArthas.fireArmor();
		magicArthas.thunderBlade();
	}
}

interface Tanker{
	public void increaseArmor(); // �Ƹ� +5
	public void increaseHp();	 // ü�� +100
}

// ���� ������ ���˻�� 2�� ������ �����ϴ�. ������ ������ ������, ���˻��� ��� 
// �������� ������ �߰��� �ο� �޴´�.
interface Healor{
	public void healingAura();	// �ʴ� ü��ȸ�� +10
	public void holyArmor();	// ������ ���� -10
}
interface Sorcerer{
	public void fireArmor();	// �ֺ��� �ʴ� ������ +10
	public void thunderBlade();	// ���ݽ� �߰� ������ +10
}

class Knight implements Tanker{
	protected String name;
	protected int hp;
	protected int armor;
	public Knight(String name, int hp, int armor) {
		super();
		this.name = name;
		this.hp = hp;
		this.armor = armor;
	}
	
	public void increaseArmor() {
		System.out.printf("[%s] increaseArmor() ����!\n",name);
		System.out.printf("\t�ƸӰ� +5 �����մϴ�.\n");
		armor += 5;
	}
	
	public void increaseHp() {
		System.out.printf("[%s] increaseHp() ����!\n",name);
		System.out.printf("\tü���� +100 �����մϴ�.\n");
		hp += 100;
	}
}
// 1. �������̽��� �޼ҵ带 �������̵�
class HolyKnight extends Knight implements Healor{
	public HolyKnight(String name,int hp,int armor){
		super(name,hp,armor);
	}
	// �ʴ� ü��ȸ�� +10
	public void healingAura() {
		System.out.printf("[%s] healingAura() ����!\n",name);
		System.out.printf("\t�ʴ� ü��ȸ�� +10 �����մϴ�.\n");
	}
	// ������ ���� -10
	public void holyArmor() {
		System.out.printf("[%s] holyArmor() ����!\n",name);
		System.out.printf("\t�ǰݽ� �������� -10 �� �޽��ϴ�.\n");
	}
}

class MagicKnight extends Knight implements Sorcerer{
	public MagicKnight(String name,int hp,int armor){
		super(name,hp,armor);
	}
	// �ֺ��� �ʴ� ������ +10
	public void fireArmor() {
		System.out.printf("[%s] fireArmor() ����!\n",name);
		System.out.printf("\t�ֺ��� �ʴ� ������ +10.\n");
	}
	// ���ݽ� �߰� ������ +10
	public void thunderBlade() {
		System.out.printf("[%s] thunderBlade() ����!\n",name);
		System.out.printf("\t���ݽ� �߰� ������ +10 �����մϴ�.\n");
	}
}