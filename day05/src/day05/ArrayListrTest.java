package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;

public class ArrayListrTest {
	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<>();
		
		System.out.println(dataList.size());
//		dataList.add(new Integer(10)); 일반타입value() 는 언박싱(감싼걸 푼다)
		dataList.add(10);			   // 언박싱이 불편할때 간결한 오토언박싱
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
		
		// (1)30 뒤에 100 추가하기 -> 30이 있는지 없는 지 확인 
		if(dataList.contains(30)) {
			dataList.add(dataList.indexOf(30)+1,100);
		}else {
			System.out.println("30은 없음");
		}
		System.out.println(dataList);
		
		// (2)60을 600으로 변경
		if(dataList.contains(60)) {
			dataList.set(dataList.indexOf(60), 600);
		}
		System.out.println(dataList);
		
		// (3)100 삭제하기(인덱스가 아닌 값으로 삭제하기)
		dataList.remove(new Integer(100));
		System.out.println(dataList);
		
		// ★정렬sort(오름차순)
		Collections.sort(dataList);
		System.out.println(dataList);
		
		Collections.reverse(dataList);
		System.out.println(dataList);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
	}
}
