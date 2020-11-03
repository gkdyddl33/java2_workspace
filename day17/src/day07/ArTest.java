package day07;

public class ArTest {
	public static void main(String[] args) {
		int[] arData = {3,4,2,7};
		System.out.println(arData);
		
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		
		arData[0] = 7;
		System.out.println(arData[0]);
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i+1;
			System.out.println(arData[i]);
		}
	}
}
