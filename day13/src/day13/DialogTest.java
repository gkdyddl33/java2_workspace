package day13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		String n1Msg = "ù��° ����:";
		String n2Msg = "�ι�° ����:";
		String resultMsg = "";
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
		
		result = num1+num2;
		resultMsg = num1+"+"+num2+"="+result;
		JOptionPane.showMessageDialog(null, resultMsg);
	}
}
