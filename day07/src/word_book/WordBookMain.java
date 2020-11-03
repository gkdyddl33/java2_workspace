package word_book;

import java.util.Iterator;
import java.util.Map.Entry;

public class WordBookMain {
	public static void main(String[] args) {
WordBookField wbf = new WordBookField();
		
//		// 추가테스트
//		if(wbf.insert("apple", "사과")) {
//			System.out.println("추가성공");
//		}
//		if(wbf.insert("applogize", "사과")) {
//			System.out.println("추가성공");
//		}
//		// 중복검사를 한 후 추가가 있을시 실패 문구 
//		if(!wbf.insert("apple", "사과")) {
//			System.out.println("추가실패/이미 존재하는 단어");
//		}
//		System.out.println(wbf.selectAll());
		
//		// 검색테스트
//		if(wbf.insert("apple", "사과")) {
//			System.out.println("추가성공");
//		}
//		
////		if(wbf.insert("applogize", "사과")) {
////			System.out.println("추가성공");
////		}
//		
//		Iterator<Entry<String, String>> iter = wbf.select("apple");
//		
//		while(iter.hasNext()) {
//			Entry<String, String> entry = iter.next();
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
		
		// 수정테스트
		if(wbf.insert("applogize", "사과")) {
			System.out.println("추가성공");
		}
		if(wbf.update("apple", "애플")) {
			System.out.println("실패/없는 단어");
		}
//		if(wbf.update("applogize", "사과하다")) {
//			System.out.println("수정성공");
//		}
//		System.out.println(wbf.selectAll());
	}
}
