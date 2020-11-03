package celeb;

import java.util.Random;
import java.util.Scanner;

public class Rabbit extends Animal{
	public Rabbit() {
		super();
	}
	
	public Rabbit(String name,int hp, String feed, int feedCnt) {
		super(name, hp, feed, feedCnt);
	}
	
	@Override
	public void walk() {
		Random r = new Random();
		int idx = r.nextInt(Animal.quizs.length);
		
		int choice = 0;
		int answer = Animal.answers[idx];
		
		System.out.println(Animal.quizs[idx]);
		choice = new Scanner(System.in).nextInt();
		
		if(answer==choice) {
			feedCnt++;
		}else {
			hp--;
			System.out.println("Ã¼·ÂÀÌ ´Ù ¶³¾îÁ³¾î¿ä.ÅÐ½â..");
			sleep();
		}
	}
}
