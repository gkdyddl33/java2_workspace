package word_book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WordBookField {
	// 영한사전(내부저장소)
		HashMap<String, String> wordBook = new HashMap<>();

		// 단어장 추가
		public boolean insert(String eng, String kor) {
			// 외부에서 전달받은 key(eng)값이 이미 있으면 수정이기 때문에
			// 없을 떄 추가해준다.
			if (!wordBook.containsKey(eng)) {
				//영어가 key, 한국어가 value로 추가
				wordBook.put(eng, kor); 
				
				// 성공
				return true;
			}
			// 실패
			return false;
		}

		// 단어장 검색
		// 외부에서 keyword를 전달받은 후 내부 저장소의 key와 value를 각각 검사한다.
		// 만약 일치하는 단어가 있다면 set타입에 저장해준다.
		public Iterator<Entry<String, String>> select(String keyword) {
			// 순서대로 나오기를 원하기 때문에
			// key와 value 모두 검사해야 하므로, entrySet()을 사용하여 한 쌍씩 가지고 온다.
			Iterator<Entry<String, String>> iter = wordBook.entrySet().iterator();
			
			// 중복방지를 위해서 set을 사용!
			// 검색결과를 담아줄 저장소
			Set<Entry<String, String>> set = new HashSet<>();
			
			// 내부저장소에 있는 데이터를 한 쌍씩 가지고 온다.
			// 반복횟수는 알 수 없기 때문에 while문을 사용해준다.
			while (iter.hasNext()) {
				// 매 반복마다 한 쌍씩 entry 객체에 담아준다.
				Entry<String, String> entry = iter.next();
				
				// 저장소에 있는 key 값과 사용자가 입력한 keyword값을 비교해서
				if (entry.getKey().equals(keyword)) {
					// 만약 일치한다면 검색결과에 추가해준다.
					set.add(entry);
				}
				// 저장소에 있는 key 값과 사용자가 입력한 keyword값을 비교해서

				if (entry.getValue().equals(keyword)) {
					// 만약 일치한다면 검색결과에 추가해준다.
					set.add(entry);
				}
			}
			// 단어를 찾은 후 순서를 부여하여 리턴해준다.
			return set.iterator();
		}

		// 단어장 수정(value 수정)
		// 외부에서 수정할 값의 짝꿍이 key값을 keyword로 전달받는다.
		// 새로운 값을 new_value로 전달받는다.
		public boolean update(String keyword,String new_value) {
			// 만약 기존에 key값이 없다면 추가가 되므로, 있을 때에만
			// put을 사용하여 수정해준다.
			if(wordBook.containsKey(keyword)) {
				wordBook.put(keyword, new_value);
				// 수정성공
				return true;
			}
			// 수정 실패
			return false;
		
		}

		// 단어장 삭제
		// key값을 전달받아서 remove()을 통해 한 쌍을 삭제한다.
		public boolean delete(String eng) {
			// remove()는 삭제한 key값을 리턴하거나 혹시 삭제할 key가 없다면
			// null을 리턴한다.
			if(wordBook.remove(eng) != null) {
				// 삭제할 key가 있다면 들어온다.
				// 삭제 성공
				return true;
			}
			// 삭제 실패
			return false;
		}

		// 단어장 목록
		public String selectAll(String keyword,String value) {
			// 전체 목록은 모든 정보가 필요하기 때문에 entrySet 을 사용하여
			// key와 value를 모두 분리하여 가지고 온다.
			// entrySet()으로 분리
			Iterator<Entry<String,String>> iter = wordBook.entrySet().iterator();
			
			// 목록결과를 담아준다. 저장공간(변수)
			String result = "";
			
			while(iter.hasNext()) {
				Entry<String,String> entry = iter.next();
				
				result += entry.getKey() + ":" + entry.getValue() + "\n";
				// 결과 : banana : 바나나 \n
				// 		apple : 사과\n
			}
			
			// 만약 저장소의 size()가 0이라면 null이라면 while문에 들어가지 않는다.
			// 이때 초기값인 "" 값이 result에 들어있으므로, 목록이 없습니다.를 리턴한다.
			// 하지만 다른 값이 들어 있다면 한 개라도 있다는 의미이므로  result를 리턴한다.
			// result = null? 를 삼항연산자로 표현 -> return
			return result.equals("")? "목록이 없습니다." : result;
		}

}
