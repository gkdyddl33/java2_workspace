package day04;

public class WrapperTest2 {
	public static void main(String[] args) {
		Object[] datas = {1,20.42,'a',"ABC"};
		
		for(Object obj : datas) {
			System.out.println(obj);
		}
		
//		Integer data_I = new Integer(10); // �ڽ�
//		Integer data_I = 10;			  // ����ڽ�	
//		
//		int data_i = data_I.intValue(); // ��ڽ�
//		int data_i = data_I;			// �����ڽ�
	}
}
