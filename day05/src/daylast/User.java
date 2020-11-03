package daylast;

public class User {
	String id;
	String pw;
	
	public User() {}

	public User(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "id:"+id+"\npw:"+pw;
	}
}
