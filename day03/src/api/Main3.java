package api;

import java.util.Random;
import java.util.Scanner;
import java.util.Arraylist;

public class Main3 {
	// 1부터 N사이 임의의 정수를 반환하도록 주사위 클래스를 완성하고,
	// 해당 주사위를 1000번 던진 값의 평균을 구하시오.
	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
				
		// N면체 주사위 생성
		Die d = new Die(N);
//		주사위를 던졌을 때 값을 얻기 위해서는?
//		System.out.println(d.roll());
		
	    // 1000번 주사위를 던진 결과를 저장
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			int randNum = d.roll(); // 임의의 값을 가져옴
			numbers.add(randNum);
			System.out.println(randNum);
		}
		// 평균값 계산
		double avg = average(numbers);
		
		// 출력
		System.out.println("avg: "+avg);
		
		// 평균값 반환
		public static double average(Arraylist<Integer> list) {
			double sum = 0;
			for(Integer n : list) {
				sum += n;
			}
			return sum/list.size();
		}
	}
}
class Die{
	private int maxNumber; // 주사위의 최대값

	public Die(int maxNumber) {
		super();
		this.maxNumber = maxNumber;
	}
	public int roll() {
		// 1~N(maxNumber)
		Random rand =  new Random();
		return 1 + rand.nextInt(maxNumber); // 1+(rand.nextInt) : 0,1,2,3,4,5 -> 1,2,3,4,5,6
	}
}
