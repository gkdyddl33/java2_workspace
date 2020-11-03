package api;

import java.util.Random;

public class ObjectTest2 {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		
		String data1 = new String("ABC");
		String data2 = new String("ABC");
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
		System.out.println(r1.equals(r2));
		
		r1=r2;
		System.out.println(r1.equals(r2));
		
		// ¡Ú¡ÚhashCode()
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
	}
}
