package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		// Q. 다음 중 동물이 아닌 것은?
		// 1.돼지 2.염소 3.우산 4.고양이
		// 정답이면 "정답" 출력, 오답이면 "오답" 출력
		
		String qMsg = "Q. 다음 중 동물이 아닌 것은?";
		String choiceMsg = "1.돼지\n2.염소\n3.우산\n4.고양이\n";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg+"\n"+choiceMsg));
		int answer = 3;
		
//		String result = choice == answer? "정답":
//			choice>=1 && choice <=4 ? "오답" : "?";
		
		String result = "";
		if(choice == answer) {
			result = "정답";
		}else if(choice < 1 || choice >4) {
			result = "잘못 입력하셨습니다.";
		}else {
			result = "오답";
		}
			
		JOptionPane.showMessageDialog(null, result);
		
	}
}
