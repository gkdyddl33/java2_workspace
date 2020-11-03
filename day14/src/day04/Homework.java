package day04;

public class Homework {
	public static void main(String[] args) {
		// (1)
		for (int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
		
		// (2)
		for (int i = 0; i < 100; i++) {
			System.out.println(100-i);
		} 
		
		// (3)
		for (int i = 0; i < 6; i++) {
			System.out.println((char)(i+65));
		}
		
		for (int i = 'a'; i < 7; i++) {
			System.out.println(i++);
		}
		
		// (4)
		for (int i = 0; i < 9; i++) {
			System.out.println(i%3);
		}
		
		// (5)
		for (int i = 0; i < 50; i++) {
			System.out.println((i+1)*2);
		}
		
		// (6)
		
		for (int i = 0; i < 26; i++) {
			System.out.println((char)(i%2==0? 97+i: 65+i));
		}
		
		// (7)
		for (int i = 0; i < 6; i++) {
			if(i==2) {
				//continue;
				i++;
			}
			System.out.println((char)(i+65));
		}
		
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			temp = i;
			if(i>1) {
				temp++;
			}
			System.out.println((char)(temp+65));
		}
	}
}
