package day07;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		String bonusMsg = "";
		int bonus = 0;
		
		// ��ī����
		int[][] arrIncome = new int[3][2];
		String[] arBranchName = {"�����","ȫ����","������"};
		String[] arAgeName = {"�Ϲ���","Ű����"};
		
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
				System.out.println(arBranchName[i]+""+arAgeName[j]+"����� �Է�(����:����)");
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
						String.format("%.2f", (double)arAgeTotal[i1] / arrIncome.length));   // �ϳ��� ���� [i]�� ���ٸ�
			}
			
			bonusMsg="���μ�Ƽ�� �����\n";
			for (int i1 = 0; i1 < arrIncome.length; i1++) 
			{
				for (int j = 0; j < arrIncome[i1].length; j++) 
				{
					if(arrIncome[i1][j] > avg)
					{
						// ������� ���� �ִ� �������� �˰� ����
						// �μ�Ƽ�긦 ������ �ִ� ������ ǥ���ϴ� �ڵ�
						bonusMsg += arBranchName[i1] +""+arAgeName[j]+"\n";
						check = true; // �μ�Ƽ�� ���� ����
					}
					
				}
				
			}
			System.out.println(check ? bonusMsg : "�й��ϼ���");
		}
	}
}
