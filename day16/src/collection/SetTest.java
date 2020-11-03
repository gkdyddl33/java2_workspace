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
		
		// SET = �˻�
		System.out.println(bloodTypeSet.contains("AB"));
		
		// GET �� ����ϱ� ���ؼ� ������ �ο������ �Ѵ�.
		// iterator �� ���� ������ �� �ִ�.
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
