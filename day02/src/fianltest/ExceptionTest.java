package fianltest;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest {
	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println(e.getMessage());
//			System.out.println(e);
//		}
		try {
			Integer.parseInt(JOptionPane.showInputDialog("정수입력"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "정수만 입력하라고");
		}
	}
}
