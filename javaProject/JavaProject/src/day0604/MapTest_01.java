package day0604;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {
	//key값 value값을 찾는다
	//순서는 유지되지않음
	//키는 중복허용하지않고 값은 중복허용함
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>map=new HashMap<String, String>();
		map.put("넘버원", "위기탈출");
		map.put("name","강호동");
		System.out.println(map.get("넘버원"));
		System.out.println(map.get("blood")); //맵에 없는 키값으로 구하면 널값
		//키값을 먼저 한꺼번에 얻은후 값을 얻는 방법
		Set<String>keyset=map.keySet();
		System.out.println("1.방법");
		Iterator<String>keyiter=keyset.iterator();
		while(keyiter.hasNext()) {
			String key=keyiter.next();
			System.out.println(key+" "+map.get(key));
		}
		
		System.out.println("2.방법");
		for(String key:keyset) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
