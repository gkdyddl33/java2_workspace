package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Numplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		String result = "";
		
		String n1Msg = "ù��° ����:";
		String n2Msg = "�ι�° ����:";
		String resultMsg = "";
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
		
		result = num1> num2 ? "ū ��:"+num1 :
			num1 == num2? "�� ���� �����ϴ�." :
				"ū ��:"+num2;
		JOptionPane.showMessageDialog(null, result);
	}
}
