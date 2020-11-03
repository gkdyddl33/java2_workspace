package day05;

public class OperTest {
	public static void main(String[] args) {
		// (1)
		for (int i = 0; i < 6; i++) {
			if(i==1) {
				continue;
			}
			System.out.println((char)(i+65));
		}
		
		// (2)
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
			if(i==69) {
				break;
			}
		}
		
		// (3)
		for (int i = 0; i < 100; i++) {
			if((i+1)%3 != 0 && (i+1)%5 != 0) {
				continue;
			}
			System.out.println(i+1);
		}
	}
}
