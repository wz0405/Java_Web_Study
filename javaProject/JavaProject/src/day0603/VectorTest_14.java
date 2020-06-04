package day0603;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열과 달리 자동으로 배열길이가 늘어난다
		
		//List<String>list=new Vector<String>();
		Vector<String>list=new Vector<String>();
		
		System.out.println("초기할당크기: "+list.capacity());
		System.out.println("초기데이터 갯수: "+list.size());
		
		//추가
		list.add("사과");
		list.add("사과");
		list.add("오렌지");
		list.add("사과");
		list.add("키위");
		
		System.out.println("갯수: "+list.size());
		
		System.out.println("1.출력");
		for(int i=0;i<list.size();i++)
		{
			String s=list.get(i);
			System.out.println(s);
		}
		System.out.println("2.출력");
		for(String s:list)
			System.out.println(s);
		
		System.out.println("3.출력");
		Iterator<String>iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
	}

}
