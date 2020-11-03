package api;

import java.util.Random;

public class Main{
	// 난수를 생성하시오.
	public static void main(String[] args) {
		// Random 객체생성
		Random rand = new Random();
		
		// 난수 생성
		// 임의의 정수를 생성하시오.
		int a = rand.nextInt();
		//0~30사이의 정수를 생성하시오.
		int b = rand.nextInt(30); // 0은포함 30은 미포함
		// 임의의 실수를 생성하시오.
		double c = rand.nextDouble();
		// 임의의 참/거짓을 생성하시오.
		boolean d = rand.nextBoolean();
		// 난수 출력
		System.out.printf("nextInt():%d\n",a);
		System.out.printf("nextInt():%d\n",b);
		System.out.printf("nextInt():%d\n",c);
		System.out.printf("nextInt():%d\n",d);
	}
}

