package day0101;

public class Practice3 {
	// 기사는 탱거의 역할을 수행한다.
	//	Healor	Tanker	Sorcerer	-> interface
	//			Knight				-> extends, implements
	//	HolyKnight		MagicKnight	-> concrete class
	public static void main(String[] args) {
		// 두 영웅 생성
		Knight uther = new HolyKnight("우서",200,10);
		Knight arthas = new MagicKnight("아서스",150,8);
		// 우서:기사 버프
		uther.increaseHp();
		uther.increaseArmor();
		
		// 우서:성기사 버프
		HolyKnight holyUther = (HolyKnight) uther;
		holyUther.healingAura();
		holyUther.holyArmor();
		// 아서스:기사 버프
		arthas.increaseHp();
		arthas.increaseArmor();
		// 아서스:마검사 버프
		MagicKnight magicArthas = (MagicKnight) arthas;
		magicArthas.fireArmor();
		magicArthas.thunderBlade();
	}
}

interface Tanker{
	public void increaseArmor(); // 아머 +5
	public void increaseHp();	 // 체력 +100
}

// 기사는 성기사와 마검사로 2차 전직이 가능하다. 성기사는 힐러의 역할을, 마검사의 경우 
// 마법사의 역할을 추가로 부여 받는다.
interface Healor{
	public void healingAura();	// 초당 체력회복 +10
	public void holyArmor();	// 데미지 감소 -10
}
interface Sorcerer{
	public void fireArmor();	// 주변적 초당 데미지 +10
	public void thunderBlade();	// 공격시 추가 데미지 +10
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
		System.out.printf("[%s] increaseArmor() 시전!\n",name);
		System.out.printf("\t아머가 +5 증가합니다.\n");
		armor += 5;
	}
	
	public void increaseHp() {
		System.out.printf("[%s] increaseHp() 시전!\n",name);
		System.out.printf("\t체력이 +100 증가합니다.\n");
		hp += 100;
	}
}
// 1. 인터페이스의 메소드를 오버라이딩
class HolyKnight extends Knight implements Healor{
	public HolyKnight(String name,int hp,int armor){
		super(name,hp,armor);
	}
	// 초당 체력회복 +10
	public void healingAura() {
		System.out.printf("[%s] healingAura() 시전!\n",name);
		System.out.printf("\t초당 체력회복 +10 증가합니다.\n");
	}
	// 데미지 감소 -10
	public void holyArmor() {
		System.out.printf("[%s] holyArmor() 시전!\n",name);
		System.out.printf("\t피격시 데미지를 -10 덜 받습니다.\n");
	}
}

class MagicKnight extends Knight implements Sorcerer{
	public MagicKnight(String name,int hp,int armor){
		super(name,hp,armor);
	}
	// 주변적 초당 데미지 +10
	public void fireArmor() {
		System.out.printf("[%s] fireArmor() 시전!\n",name);
		System.out.printf("\t주변적 초당 데미지 +10.\n");
	}
	// 공격시 추가 데미지 +10
	public void thunderBlade() {
		System.out.printf("[%s] thunderBlade() 시전!\n",name);
		System.out.printf("\t공격시 추가 데미지 +10 증가합니다.\n");
	}
}