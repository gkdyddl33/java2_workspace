package day06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WordBookField {
	// 영한사전
	HashMap<String, String> wordBook = new HashMap<>();

	// 단어장 추가
	public boolean insert(String eng, String kor) {
		if (wordBook.containsKey(eng)) {
			wordBook.put(eng, kor);
			return true;
		}
		return false;
	}

	// 단어장 검색
	public Iterator<Entry<String,String>> select(String keyword) {
		Iterator<Entry<String,String>> iter = wordBook.entrySet().iterator();
		Set<Entry<String,String>> set = new HashSet<>();
		
		while(iter.hasNext()) {
			Entry<String,String> entry = iter.next();
			if(entry.getKey().equals(keyword)) {
				set.add(entry);
			}
			if(entry.getValue().equals(keyword)) {
				set.add(entry);
			}
		}
		return set.iterator();
	}

	// 단어장 수정
	public void update(String eng,String kor) {
		if(wordBook.containsKey(eng)) {
			wordBook.entrySet();
		}
		if(wordBook.containsValue(kor)) {
			wordBook.entrySet();
		}
	}

	// 단어장 삭제
	public void delete(String keyword) {
		if(wordBook.containsKey(keyword)) {
			wordBook.remove(keyword);
		}
	}

	// 단어장 목록
	public void selectAll() {
		Iterator<Entry<String,String>> iter = wordBook.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,String> entry = iter.next();
			System.out.println("단어장 목록 :"+wordBook.get(iter));
		}
	}
	public static void main(String[] args) {
		
	}
}
