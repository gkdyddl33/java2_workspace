package fianltest;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class ExceptionTest {
	public static void main(String[] args) {
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println(e.getMessage());
//			System.out.println(e);
//		}
		try {
			Integer.parseInt(JOptionPane.showInputDialog("�����Է�"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "������ �Է��϶��");
		}
	}
}
