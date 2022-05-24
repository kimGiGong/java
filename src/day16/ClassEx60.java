package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ClassEx60 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		//	요소 삽입
		map.put("apple", "사과");
		map.put("strawberry", "딸기");
		map.put("watermelon", "수박");
		map.put("peach", "복숭아");
		
		System.out.println(map);
		map.put("apple", "부사");	// 같은 key로 put하면 value 수정효과
		System.out.println(map);
		
		System.out.println(map.containsKey("apple"));
		System.out.println(map.containsKey("grapefruit"));
		
		System.out.println(map.containsValue("사과"));;
		System.out.println(map.containsValue("부사"));;
		
		Set<Entry<String, String>> set =  map.entrySet();		//	key를 Set으로 형변환 해줌	
		Iterator<Entry<String, String>> it = set.iterator();	// 	entry = key와value 두값을 저장함
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + "," +entry.getValue());
		}
		
		
		
		//	값 꺼내기 : 키주면 밸류 리턴해줌
		String val = map.get("apple");
		System.out.println(val);
		String val2 = map.get("melon");	//없으면 null 리턴
		System.out.println(val2);
		
		//	요소 삭제 : 키값 주고 삭제
		map.remove("peach");
		System.out.println(map);
		
		//	요소의 갯수
		System.out.println(map.size());
		
		//	전체 검색 : 순서X , index -> 사용자 정의 , key값에도 순차가 없다.
		Set<String> keytool =map.keySet();			//	map에서 키들만 뽑아오기
		Iterator<String> it2 =keytool.iterator();	//  키의 반복자를 얻어 키들을 정렬시킴
		while(it.hasNext()) {						//	반복자의 마지막 요소까지 반복해라
			String key = it2.next();					//	반복자에서 요소하나 꺼내기 = key하나 꺼냄
			String value = map.get(key);			//	map에서 꺼낸 key값 주고 value값 꺼내기
			System.out.println(key+"<-key value->"+value);
		}
		
	}
}
