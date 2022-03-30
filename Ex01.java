package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
	// HashMap map = new HashMap();
	LinkedHashMap map = new LinkedHashMap();
	map.put("선풍기", "100만원");										//put 추가하기 (AL ADD와 같은 기능)
	map.put("에어컨11", "10만원");
	map.put("11자동차", "1만원");
	
	System.out.println("선풍기 : " +map.get("선풍기"));               //get 불러오기
	System.out.println("에어컨 : " +map.get("에어컨"));
	System.out.println("자동차 : " +map.get("자동차"));
	System.out.println("없는값 : " +map.get("없는값"));
	
	System.out.println("결과 : " +
						map.containsKey("선풍기"));					// contain 해당키 존재하면 T 없으면 F
	System.out.println("결과 : " +
			map.containsKey("선풍기11"));
	System.out.println(map.remove("선풍기"));
	Object bool = map.remove("");
	
	
	System.out.println
			("true해당작 잘 삭제, null 해당 키 없음"+bool);
	
	if(bool == null) {
		System.out.println("삭제 실패");
	}else {
			System.out.println("삭제 성공");
	}
	 System.out.println("키 목록 : " +  map.keySet());
	 System.out.println("값 목록 : " +  map.values());
	
	 Set s = map.keySet(); //Set 자료형 변수에 저장해야한다.          //Set 은 인덱스 접근불가라  Iterator로 접근
	 Iterator it = map.keySet().iterator();  //it 반복자로 만들어진다
	 while(it.hasNext()) {                 // 다음값이 있습니까?
		 Object obj = it.next();					// true 입니다,  "선풍기" "자동차"
		 System.out.println(obj + " :" + map.get(obj)); //키와 값 동시에 출력
		 
		 // Linked HashMap  => 순서유지를 하고싶으면 사용  // LinkedHashMap map = new LinkedHashMap();
		 
		 
	 }
	}

}
