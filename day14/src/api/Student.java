package api;

public class Student {
	int num;
	String name;
	
	public Student() {}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(std.hashCode()==this.hashCode()) {
				return true;
			}
		}
		return false;				
	}
}
