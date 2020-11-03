package api;

public class ArcharMain {
	public static void main(String[] args) {
		Archar archar1 = new Archar("궁수1","상");
		Archar archar2 = new Archar("궁수1","상");
		
		System.out.println(archar1 == archar2); // 인스턴스 변수가 다르기 때문에
												// 당연히 다른 값이 나오므로 false가 나온다.
		System.out.println(archar1.equals(archar2)); // 안에 들어 있는 문자가 같니?
													 // 문자는 동일 하기 때문에 true가 나온다.
	}
}
