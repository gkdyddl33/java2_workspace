package day04;

public class ObjectTest2 {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		System.out.println(data1);
		System.out.println(data1==data2);
		
		System.out.println(data3);
		System.out.println(data3==data4);
		System.out.println(data3.equals(data4));
		
		System.out.println(data1==data3);
		System.out.println(data1==data3.intern());
		System.out.println(data3.intern()==data4.intern());
	}
}
