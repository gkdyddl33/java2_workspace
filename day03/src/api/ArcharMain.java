package api;

public class ArcharMain {
	public static void main(String[] args) {
		Archar archar1 = new Archar("�ü�1","��");
		Archar archar2 = new Archar("�ü�1","��");
		
		System.out.println(archar1 == archar2); // �ν��Ͻ� ������ �ٸ��� ������
												// �翬�� �ٸ� ���� �����Ƿ� false�� ���´�.
		System.out.println(archar1.equals(archar2)); // �ȿ� ��� �ִ� ���ڰ� ����?
													 // ���ڴ� ���� �ϱ� ������ true�� ���´�.
	}
}
