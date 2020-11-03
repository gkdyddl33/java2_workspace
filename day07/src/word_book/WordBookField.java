package word_book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WordBookField {
	// ���ѻ���(���������)
		HashMap<String, String> wordBook = new HashMap<>();

		// �ܾ��� �߰�
		public boolean insert(String eng, String kor) {
			// �ܺο��� ���޹��� key(eng)���� �̹� ������ �����̱� ������
			// ���� �� �߰����ش�.
			if (!wordBook.containsKey(eng)) {
				//��� key, �ѱ�� value�� �߰�
				wordBook.put(eng, kor); 
				
				// ����
				return true;
			}
			// ����
			return false;
		}

		// �ܾ��� �˻�
		// �ܺο��� keyword�� ���޹��� �� ���� ������� key�� value�� ���� �˻��Ѵ�.
		// ���� ��ġ�ϴ� �ܾ �ִٸ� setŸ�Կ� �������ش�.
		public Iterator<Entry<String, String>> select(String keyword) {
			// ������� �����⸦ ���ϱ� ������
			// key�� value ��� �˻��ؾ� �ϹǷ�, entrySet()�� ����Ͽ� �� �־� ������ �´�.
			Iterator<Entry<String, String>> iter = wordBook.entrySet().iterator();
			
			// �ߺ������� ���ؼ� set�� ���!
			// �˻������ ����� �����
			Set<Entry<String, String>> set = new HashSet<>();
			
			// ��������ҿ� �ִ� �����͸� �� �־� ������ �´�.
			// �ݺ�Ƚ���� �� �� ���� ������ while���� ������ش�.
			while (iter.hasNext()) {
				// �� �ݺ����� �� �־� entry ��ü�� ����ش�.
				Entry<String, String> entry = iter.next();
				
				// ����ҿ� �ִ� key ���� ����ڰ� �Է��� keyword���� ���ؼ�
				if (entry.getKey().equals(keyword)) {
					// ���� ��ġ�Ѵٸ� �˻������ �߰����ش�.
					set.add(entry);
				}
				// ����ҿ� �ִ� key ���� ����ڰ� �Է��� keyword���� ���ؼ�

				if (entry.getValue().equals(keyword)) {
					// ���� ��ġ�Ѵٸ� �˻������ �߰����ش�.
					set.add(entry);
				}
			}
			// �ܾ ã�� �� ������ �ο��Ͽ� �������ش�.
			return set.iterator();
		}

		// �ܾ��� ����(value ����)
		// �ܺο��� ������ ���� ¦���� key���� keyword�� ���޹޴´�.
		// ���ο� ���� new_value�� ���޹޴´�.
		public boolean update(String keyword,String new_value) {
			// ���� ������ key���� ���ٸ� �߰��� �ǹǷ�, ���� ������
			// put�� ����Ͽ� �������ش�.
			if(wordBook.containsKey(keyword)) {
				wordBook.put(keyword, new_value);
				// ��������
				return true;
			}
			// ���� ����
			return false;
		
		}

		// �ܾ��� ����
		// key���� ���޹޾Ƽ� remove()�� ���� �� ���� �����Ѵ�.
		public boolean delete(String eng) {
			// remove()�� ������ key���� �����ϰų� Ȥ�� ������ key�� ���ٸ�
			// null�� �����Ѵ�.
			if(wordBook.remove(eng) != null) {
				// ������ key�� �ִٸ� ���´�.
				// ���� ����
				return true;
			}
			// ���� ����
			return false;
		}

		// �ܾ��� ���
		public String selectAll(String keyword,String value) {
			// ��ü ����� ��� ������ �ʿ��ϱ� ������ entrySet �� ����Ͽ�
			// key�� value�� ��� �и��Ͽ� ������ �´�.
			// entrySet()���� �и�
			Iterator<Entry<String,String>> iter = wordBook.entrySet().iterator();
			
			// ��ϰ���� ����ش�. �������(����)
			String result = "";
			
			while(iter.hasNext()) {
				Entry<String,String> entry = iter.next();
				
				result += entry.getKey() + ":" + entry.getValue() + "\n";
				// ��� : banana : �ٳ��� \n
				// 		apple : ���\n
			}
			
			// ���� ������� size()�� 0�̶�� null�̶�� while���� ���� �ʴ´�.
			// �̶� �ʱⰪ�� "" ���� result�� ��������Ƿ�, ����� �����ϴ�.�� �����Ѵ�.
			// ������ �ٸ� ���� ��� �ִٸ� �� ���� �ִٴ� �ǹ��̹Ƿ�  result�� �����Ѵ�.
			// result = null? �� ���׿����ڷ� ǥ�� -> return
			return result.equals("")? "����� �����ϴ�." : result;
		}

}
