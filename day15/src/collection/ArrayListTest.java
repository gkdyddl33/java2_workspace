package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<>();
		
		System.out.println(dataList.size());
		
		dataList.add(10);
		System.out.println(dataList.size());
		
		dataList.add(80);
		dataList.add(90);
		dataList.add(30);
		dataList.add(20);
		dataList.add(60);
		dataList.add(50);
		dataList.add(70);
		dataList.add(40);
//		for (int i = 0; i < dataList.size(); i++) {
//			System.out.println(dataList.get(i));
//		}
		
		for(int data : dataList) {
			System.out.println(data);
		}
		System.out.println(dataList);
		
		
		// (1)30 뒤에 100 추가하기
		
		if(dataList.contains(30)) {
			dataList.add(dataList.indexOf(30)+1,100);
		}else {
			System.out.println("30 없음");
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
		
		// ★다른코드 알아보기
		Collections.sort(dataList);	// 오름차순
		System.out.println(dataList);
		
		Collections.reverse(dataList);	// 내림차순
		System.out.println(dataList);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
	} 
	
}
