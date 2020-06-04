package day0604;

import java.util.ArrayList;

public class ArrayListTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"장미","후리지아","백합"};
		ArrayList<String>list=new ArrayList<String>();
		
		for(String s:str) {
			list.add(s);
		}
		System.out.println("1. 출력");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("2. 출력");
		for (String s:list) {
			System.out.println(s);
		}
	}

}
