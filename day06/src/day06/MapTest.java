package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.SynchronousQueue;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("���", 2000);
		fruitMap.put("������", 3500);
		fruitMap.put("����", 3000);
		fruitMap.put("�ٳ���", 4000);
		
		// ���� �� ����, ��հ��� ���(value(), foreach�� ���)
		int total = 0;
		for(int price : fruitMap.values()) {
			total += price;
		}
		System.out.println(String.format("%.2f", (double)total/fruitMap.size()));
		
		// �޴��� : entry�� �ѽ��� ����ִ� �޼ҵ�
		Iterator<Entry<String, Integer>> iter_en = fruitMap.entrySet().iterator();
		while(iter_en.hasNext()) {
			Entry<String, Integer> entry = iter_en.next();
			System.out.println("�����̸�:"+entry.getKey()+",���ϰ���:");
			System.out.println(entry.getValue()+"��");
		}
		
		
		
//		// put = ���� �ƴϸ� ����.
//		System.out.println(fruitMap);
//		System.out.println(fruitMap.get("�ٳ���")+"��");
//		System.out.println(fruitMap.size());
//		
//		if(fruitMap.containsKey("���")) {
//			fruitMap.put("���", 1000);
//		}
//		System.out.println(fruitMap.get("���"));
//		
//		fruitMap.remove("����");
//		System.out.println(fruitMap);
		
		// Ű ���� �и�
		Iterator<String> iter = fruitMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
