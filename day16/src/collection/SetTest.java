package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> bloodTypeSet = new HashSet<>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		System.out.println(bloodTypeSet.size());
		
		// SET = 검사
		System.out.println(bloodTypeSet.contains("AB"));
		
		// GET 을 사용하기 위해서 순서를 부여해줘야 한다.
		// iterator 로 값을 가져올 수 있다.
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
