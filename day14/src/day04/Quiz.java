package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		// Q. ���� �� ������ �ƴ� ����?
		// 1.���� 2.���� 3.��� 4.�����
		// �����̸� "����" ���, �����̸� "����" ���
		
		String qMsg = "Q. ���� �� ������ �ƴ� ����?";
		String choiceMsg = "1.����\n2.����\n3.���\n4.�����\n";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg+"\n"+choiceMsg));
		int answer = 3;
		
//		String result = choice == answer? "����":
//			choice>=1 && choice <=4 ? "����" : "?";
		
		String result = "";
		if(choice == answer) {
			result = "����";
		}else if(choice < 1 || choice >4) {
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}else {
			result = "����";
		}
			
		JOptionPane.showMessageDialog(null, result);
		
	}
}
