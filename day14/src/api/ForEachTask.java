package api;

import java.util.Scanner;

public class ForEachTask {
	public static void main(String[] args) {
		int[][] arrScore = { 
				{ 10, 20, 30 },
				{ 11, 25, 39 },
				{ 12, 26, 38 },
				{ 13, 27, 37 },
				{ 42, 28, 36 } 
		};
		
		// 5명의 학생의 국영수 점수가 있다.
		// 각 학생별 총점과 평균 점수를 출력한다.
		// 단,빠른 for문만 사용할 것
		double avg = 0.0;
		int idx = 0;
		
		for(int[] arScore : arrScore) {
			int total = 0;
			for(int score : arScore) {
				total += score;
			}
			avg = Double.parseDouble(String.format("%.2f",(total+0.0)/arScore.length ));
			System.out.println(++idx+"번째 학생 총점:"+total+"점");
			System.out.println(++idx+"번째 학생 평균:"+avg+"점");
		}
		
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arrScore.length; i++) {
//			System.out.println("국어:\n");
//			System.out.println("영어:\n");
//			System.out.println("수학:\n");
//			
//		}
	}
}
