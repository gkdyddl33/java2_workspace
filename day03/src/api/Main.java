package api;

import java.util.Random;

public class Main{
	// ������ �����Ͻÿ�.
	public static void main(String[] args) {
		// Random ��ü����
		Random rand = new Random();
		
		// ���� ����
		// ������ ������ �����Ͻÿ�.
		int a = rand.nextInt();
		//0~30������ ������ �����Ͻÿ�.
		int b = rand.nextInt(30); // 0������ 30�� ������
		// ������ �Ǽ��� �����Ͻÿ�.
		double c = rand.nextDouble();
		// ������ ��/������ �����Ͻÿ�.
		boolean d = rand.nextBoolean();
		// ���� ���
		System.out.printf("nextInt():%d\n",a);
		System.out.printf("nextInt():%d\n",b);
		System.out.printf("nextInt():%d\n",c);
		System.out.printf("nextInt():%d\n",d);
	}
}

