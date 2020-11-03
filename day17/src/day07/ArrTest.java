package day07;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {
				{3,7,8},
				{4,6,9}
		};
//		for (int i = 0; i < arrData.length; i++) {
//			for (int j = 0; j < arrData[i].length; j++) {
//				System.out.print(arrData[i][j]);
//			}
//		}
		
		int length = arrData.length * arrData[0].length;
		for (int i = 0; i < length; i++) {
			System.out.println(arrData[i/3][i%3]);
		}
	}
}
