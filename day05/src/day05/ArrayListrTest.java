package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;

public class ArrayListrTest {
	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<>();
		
		System.out.println(dataList.size());
//		dataList.add(new Integer(10)); �Ϲ�Ÿ��value() �� ��ڽ�(���Ѱ� Ǭ��)
		dataList.add(10);			   // ��ڽ��� �����Ҷ� ������ �����ڽ�
		System.out.println(dataList.size());
		
		dataList.add(80);
		dataList.add(90);
		dataList.add(30);
		dataList.add(20);
		dataList.add(60);
		dataList.add(50);
		dataList.add(70);
		dataList.add(40);
		for (int i = 0; i < dataList.size(); i++) {
			System.out.print(dataList.get(i));
		}
		
		for(int data : dataList) {
			System.out.println(data);
		}
		System.out.println(dataList);
		
		// (1)30 �ڿ� 100 �߰��ϱ� -> 30�� �ִ��� ���� �� Ȯ�� 
		if(dataList.contains(30)) {
			dataList.add(dataList.indexOf(30)+1,100);
		}else {
			System.out.println("30�� ����");
		}
		System.out.println(dataList);
		
		// (2)60�� 600���� ����
		if(dataList.contains(60)) {
			dataList.set(dataList.indexOf(60), 600);
		}
		System.out.println(dataList);
		
		// (3)100 �����ϱ�(�ε����� �ƴ� ������ �����ϱ�)
		dataList.remove(new Integer(100));
		System.out.println(dataList);
		
		// ������sort(��������)
		Collections.sort(dataList);
		System.out.println(dataList);
		
		Collections.reverse(dataList);
		System.out.println(dataList);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
	}
}
