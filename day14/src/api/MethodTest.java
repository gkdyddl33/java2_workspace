package api;

public class MethodTest {
	// ��������
	// �ѱ��� ������ �������ִ� �޼ҵ�
	// �ϰ��̻� > 1024
	
	public int changeToInteger(String hangle) {
		String org_hangle = "�����̻�����ĥ�ȱ�";
		String result = "";
		
		for (int i = 0; i < hangle.length(); i++) {
			result += org_hangle.indexOf(hangle.charAt(i));
		}
		
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		System.out.println(new MethodTest().changeToInteger("���̻�����ĥ�ȱ�"));
	}
	
}
