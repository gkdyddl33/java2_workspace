package word_book;

import java.util.Iterator;
import java.util.Map.Entry;

public class WordBookMain {
	public static void main(String[] args) {
WordBookField wbf = new WordBookField();
		
//		// �߰��׽�Ʈ
//		if(wbf.insert("apple", "���")) {
//			System.out.println("�߰�����");
//		}
//		if(wbf.insert("applogize", "���")) {
//			System.out.println("�߰�����");
//		}
//		// �ߺ��˻縦 �� �� �߰��� ������ ���� ���� 
//		if(!wbf.insert("apple", "���")) {
//			System.out.println("�߰�����/�̹� �����ϴ� �ܾ�");
//		}
//		System.out.println(wbf.selectAll());
		
//		// �˻��׽�Ʈ
//		if(wbf.insert("apple", "���")) {
//			System.out.println("�߰�����");
//		}
//		
////		if(wbf.insert("applogize", "���")) {
////			System.out.println("�߰�����");
////		}
//		
//		Iterator<Entry<String, String>> iter = wbf.select("apple");
//		
//		while(iter.hasNext()) {
//			Entry<String, String> entry = iter.next();
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		// �����׽�Ʈ
		if(wbf.insert("applogize", "���")) {
			System.out.println("�߰�����");
		}
		if(wbf.update("apple", "����")) {
			System.out.println("����/���� �ܾ�");
		}
//		if(wbf.update("applogize", "����ϴ�")) {
//			System.out.println("��������");
//		}
//		System.out.println(wbf.selectAll());
	}
}
