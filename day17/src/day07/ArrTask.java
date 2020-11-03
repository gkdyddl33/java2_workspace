package day07;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		String bonusMsg = "";
		int bonus = 0;
		
		// 대카생성
		int[][] arrIncome = new int[3][2];
		String[] arBranchName = {"잠실점","홍대점","강남점"};
		String[] arAgeName = {"일반점","키즈점"};
		
		int[] arBranchTotal = new int[3];
		double[] arBranchAvg = new double[3];
		
		int[] arAgeTotal = new int[2];
		double[] arAgeAvg = new double[2];
		
		int total = 0;
		double avg = 0.0;
		
		int length = 0;
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arrIncome.length; i++) {
			length += arrIncome[i].length;
			for (int j = 0; j < arrIncome.length; j++) {
				System.out.println(arBranchName[i]+""+arAgeName[j]+"매출액 입력(단위:만원)");
				arrIncome[i][j] = sc.nextInt();
				
				arBranchTotal[i] += arrIncome[i][j];
				arAgeAvg[j] += arrIncome[i][j];
				
				total += arrIncome[i][j];
			}
			arBranchAvg[i] = Double.parseDouble(
					String.format("%.2f", (double)arBranchTotal[i] / arrIncome[i].length));
			
			avg = Double.parseDouble(
					String.format("%.2f", (double)total / length));
			
			for (int i1 = 0; i1 < arAgeAvg.length; i1++) 
			{
				arAgeAvg[i1] = Double.parseDouble(
						String.format("%.2f", (double)arAgeTotal[i1] / arrIncome.length));   // 하나가 빠짐 [i]가 없다면
			}
			
			bonusMsg="★인센티브 매장★\n";
			for (int i1 = 0; i1 < arrIncome.length; i1++) 
			{
				for (int j = 0; j < arrIncome[i1].length; j++) 
				{
					if(arrIncome[i1][j] > avg)
					{
						// 매출액을 갖고 있는 지점명을 알고 싶음
						// 인센티브를 가지고 있는 매장을 표현하는 코드
						bonusMsg += arBranchName[i1] +""+arAgeName[j]+"\n";
						check = true; // 인센티브 매장 존재
					}
					
				}
				
			}
			System.out.println(check ? bonusMsg : "분발하세요");
		}
	}
}
