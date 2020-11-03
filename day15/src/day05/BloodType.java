package day05;

import java.util.Scanner;

public class BloodType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String qMsg = "Q.����� ��������?";
		String choiceMsg = "1.A\n2.B\n3.O\n4.AB\n5.�׸��ϱ�";
		int choice = 0;

		String a_msg = "�Ĳ��ϰ� �����ϴ�.";
		String b_msg = "�������� ���� ȭ���ϴ�.";
		String o_msg = "�米���� ����.";
		String ab_msg = "���ϴ�.";

		String result = "";
		String errMsg = " �ٽ� �õ����ּ���.";

		while (!result.equals("end")) {
			System.out.println(qMsg + "\n" + choiceMsg);
			choice = sc.nextInt();
//		result = choice == 1? a_msg :
//			choice ==2? b_msg :
//				choice ==3? o_msg :
//					choice ==4? ab_msg : errMsg;
			if(choice == 5) {
				break;
			}
			switch (choice) {
			case 1:
				result = a_msg;
				break;
			case 2:
				result = b_msg;
				break;
			case 3:
				result = o_msg;
				break;
			case 4:
				result = ab_msg;
				break;
			default:
				result = errMsg;
			}
			System.out.println(result);
		}
	}
}
