package api;

public class WrapperTest {
	public static void main(String[] args) {
		Object[] datas = {1,20.42,'a',"ABC"};
		
//		Integer data_I = new Integer(10);	// �ڽ�
//		int data_i = data_I.intValue();		// ��ڽ�
		
		Integer data_I= 10;					// ����ڽ�
		int data_i = data_I;				// �����ڽ�
	}
}
