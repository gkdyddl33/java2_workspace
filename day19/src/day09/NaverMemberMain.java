package day09;

public class NaverMemberMain {
	public static void main(String[] args) {
//		User users[] = new User[4];
		
		User user1 = new User("kim123","k123","김길동");
		User user2 = new User("park123","p123","박길동");
		User user3 = new User("song123","s123","송길동");
		User user4 = new User("lee123","l123","이길동");
		
		User.hpage = "www.google.com";
		user1.info();
		user2.info();
		user3.info();
		user4.info();
	}
}

class User{
	static String hpage = "www.naver.com";
	
	String id;
	String pw;
	String name;
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public static String getHpage() {
		return hpage;
	}

	public static void setHpage(String hpage) {
		User.hpage = hpage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("hpage:"+hpage);
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
	}
}
