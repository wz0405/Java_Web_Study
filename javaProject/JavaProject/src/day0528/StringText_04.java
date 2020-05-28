package day0528;

import java.util.Scanner;

public class StringText_04 {
	public static void test1() {
		Scanner sc=new Scanner(System.in);
		String name;
		int cnt=0;
		
		while(true)
		{
			System.out.println("이름입력(종료=끝)");
			name=sc.nextLine();
			
			if(name.contentEquals("끝"))
				break;
			if(name.startsWith("김"))
				cnt++;
		}
		System.out.println("김씨성을 가진사람은 총"+cnt+"입니다");
	}
	public static void test2() {
		//charAt(index) : 한글자만 추출
		String a="950327-1010101";
		char check=a.charAt(7);
		if (check=='1') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		
	}
	public static void test3() {
		//substring으로 문자열 추출
		String str="나는 fn이노에듀에서 혁신성장을 배우는 중입니다.";
		
		String word1=str.substring(12,16);
		System.out.println(word1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();
	}

}
