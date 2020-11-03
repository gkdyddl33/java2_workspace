package day06;

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
		System.out.println(bloodTypeSet);
		
		System.out.println(bloodTypeSet.contains("AB"));
		
		// iterator의 껍데기를 bloodTypeSet으로 구현해 값을 넣어준다.
		Iterator<String> iter = bloodTypeSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
