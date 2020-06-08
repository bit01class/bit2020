package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex14 {

//	Hashtable, HashMap의 공통점
	//	내부적으로 모두 Hash 기법을 이용한다.
	//	Map 인터페이스를 구현하고 있다.
	//	Key와 Value를 이용해서 Data를 관리한다.
//	Hashtable, HashMap의 차이점
	//	Hashtable은 동기화가 보장된다.
	//	HashMap은 동기화가 보장되지 않는다.
	//	HashMap의 동기화 지원 방법 : Map m = Collections.synchronizedMap(New HashMap(…));
//	Hashtable, HashMap과 HashSet과의 관계
	//	Hashtable과 HashMap은 둘 다 Map 인터페이스를 구현하고 있다.
	//	HashSet은 내부적으로 Hash기법을 사용하지만 Set인터페이스를 구현하고 있다.
	
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("key3", "val3");
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key4", "val4");
		
//		Set<String> keys = map.keySet();
//		Iterator<String> ite = keys.iterator();
//		while(ite.hasNext()){
//			String key = ite.next();
//			System.out.println(key+":"+map.get(key));
//		}
		Set<Entry<String, String>> entrys = map.entrySet();
		Iterator<Entry<String, String>> ite = entrys.iterator();
		while(ite.hasNext()){
			Entry<String, String> entry = ite.next();
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}

}















