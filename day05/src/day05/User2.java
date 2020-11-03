package day05;

public class User2 {
	String id;
	String pw;
	
	public User2() {}

	public User2(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "id:"+id+"\npw:"+pw;
	}
}
