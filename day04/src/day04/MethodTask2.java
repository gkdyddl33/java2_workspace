package day04;

public class MethodTask2 {
	public int changeToInteger(String hangle) {
		String org_hangle = "�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
			result += org_hangle.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		System.out.println(new MethodTask2().changeToInteger("���̻�����ĥ�ȱ�"));
	}
}
