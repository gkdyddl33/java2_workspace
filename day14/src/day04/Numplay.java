package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Numplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String result = "";
		
		String n1Msg = "첫번째 정수:";
		String n2Msg = "두번째 정수:";
		String resultMsg = "";
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
		
		result = num1> num2 ? "큰 값:"+num1 :
			num1 == num2? "두 수가 같습니다." :
				"큰 값:"+num2;
		JOptionPane.showMessageDialog(null, result);
	}
}
