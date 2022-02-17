package api.util.collection.map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// Map: Key와 Value값을 한쌍으로 데이터들을 관리하는 컬렉션
		//:Key값을 통하여 value값을 관리한다.
		//:key-중복불가	value-중복가능
		//:순서는 유지되지 않는다.
		//:웹에서의 기본적으로 데이터 이동시 사용되는 것이 map이다.
		
		//ex> 아이디:key값, 비밀번호:value값으로 관리
		
		Map<String,Integer> map = new HashMap<String,Integer>();//<>안에는 앞에서 써줬으니까 굳이 안써줘도된다
		
		//데이터 추가: put(key,value);
		map.put("Black", 1);
		map.put("White", 2);
		map.put("Gray", 3);
		map.put("Blue", 4);
		map.put("Red", 5);
		map.put("Green", 6);
		map.put("Black", 2);//같은 key값(ex>"Black")을 넣을 경우 value값만 변경시킨다
		System.out.println(map.get("Black")); //2
		System.out.println("======================================");
		
		//데이터 수정: .replace(K,V);
		map.replace("Black", 3);//key값으로 찾아서 같은 key값의 value값을 변경
		System.out.println(map.get("Black")); //3
		System.out.println(map.replace("black",4)); //null인이유: key값("black")이 존재하지 않음
		System.out.println(map.get("black")); //null인 이유: 없는 key값은 null로 반환한다
		System.out.println("======================================");
		
		//.containsKey(K)	containsValue(V): 데이터의 유무(데이터가 있는지 없는지)를 확인하는 메소드
		System.out.println(map.containsKey("Black")); //true
		System.out.println(map.containsKey("Pink")); //false
		System.out.println(map.containsValue(1)); //false
		System.out.println(map.containsValue(3)); //true (Gray,Black)
		System.out.println("======================================");
		
		//.size(): map의 데이터의 개수
		System.out.println(map.size());
		System.out.println("======================================");
		
		
		//.get(key): 데이터 추출
		System.out.println(map.get("Black")); //3
		System.out.println(map.get("black")); //null인 이유: key값이 없으면 null로 반환한다
		System.out.println("======================================");
		
		//.remove(key): 데이터 삭제
		System.out.println(map.get("Black")); //3
		map.remove("Black");
		System.out.println(map.get("Black")); //삭제 후 null
		System.out.println("======================================");
		
		//데이터 전체 추출: map을 set으로 만들고, set을 iterator로 만들어야 출력 가능
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next(); //key값을 가져옴
			int value = map.get(key); //value값은 key값을 통해서만 가져올 수 있다
			System.out.println("Key: "+key+"\tValue: "+value);
		}
		System.out.println("======================================");
		
		//.clear(): map안에 데이터들을 모두 비우는 역할
		map.clear();
		System.out.println(map.size());
	}

}
