package day04;

import java.util.Scanner;

public class ForeachTask {
	public static void main(String[] args) {

		// 5���� �л��� ������ ������ �ִ�.
		int[][] arrScore = {
				{10,20,30},
				{11,25,39},
				{12,26,38},
				{13,27,37},
				{42,28,36}
		};
		// �� �л��� ������ ��� ������ ����Ѵ�.
		// ��,���� for���� ����� ��
		double avg = 0.0;
		int idx = 0;
		
		for(int[] arScore : arrScore) {
			int total = 0;
			for(int score : arScore) {
				total += score;
			}
			avg = Double.parseDouble(String.format("%.2f", (total+0.0)/arScore.length);
			System.out.println(idx+"��° �л� ����"+total+"��");
			System.out.println(idx+"��° �л� ���"+avg+"��");
			
		}
	
	}
}
