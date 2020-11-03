package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.SynchronousQueue;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("사과", 2000);
		fruitMap.put("오렌지", 3500);
		fruitMap.put("참외", 3000);
		fruitMap.put("바나나", 4000);
		
		// 과일 총 가격, 평균가격 출력(value(), foreach문 사용)
		int total = 0;
		for(int price : fruitMap.values()) {
			total += price;
		}
		System.out.println(String.format("%.2f", (double)total/fruitMap.size()));
		
		// 메뉴판 : entry는 한쌍을 담아주는 메소드
		Iterator<Entry<String, Integer>> iter_en = fruitMap.entrySet().iterator();
		while(iter_en.hasNext()) {
			Entry<String, Integer> entry = iter_en.next();
			System.out.println("과일이름:"+entry.getKey()+",과일가격:");
			System.out.println(entry.getValue()+"원");
		}
		
		
		
//		// put = 수정 아니면 삽입.
//		System.out.println(fruitMap);
//		System.out.println(fruitMap.get("바나나")+"원");
//		System.out.println(fruitMap.size());
//		
//		if(fruitMap.containsKey("사과")) {
//			fruitMap.put("사과", 1000);
//		}
//		System.out.println(fruitMap.get("사과"));
//		
//		fruitMap.remove("참외");
//		System.out.println(fruitMap);
		
		// 키 값을 분리
		Iterator<String> iter = fruitMap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
