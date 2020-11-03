package day01;

public class Interface3 {
	// 다양한 직업군이 있다.
	// 뮤지션,건축가,개발자,변호사,etc... 우리는 모두 친구다.
	// 그룹화 기능을 사용하여 동작하도록 하시오.
	public static void main(String[] args) {
		// 객체생성
		Artist kim = new Artist("뮤지션 김씨");
		Architect lee = new Architect("건축가 이씨");
		Developer park = new Developer("개발자 박씨");
		Lawyer choi = new Lawyer("변호사 최씨");
		
		// 그룹화 : 인터페이스 기준
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
	
	// 프로토타입 메소드를 재정의
	public void dearFriend() {
		System.out.printf("%s -> 칭구 아이가!\n",name);
	}
}

class Architect implements Friend{
	private String name;
	public Architect(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> 칭구 아이가!\n",name);
	}
}

class Developer implements Friend{
	private String name;
	public Developer(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> 칭구 아이가!\n",name);
	}
}

class Lawyer implements Friend{
	private String name;
	public Lawyer(String name) {
		this.name = name;
	}
	public void dearFriend() {
		System.out.printf("%s -> 칭구 아이가!\n",name);
	}
}