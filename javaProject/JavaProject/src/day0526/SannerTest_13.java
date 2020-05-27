package day0526;

import java.util.Scanner;

public class SannerTest_13 {
	public static void main(String[] args) {
		//scanner는 문자열이나 숫자를 키보드로 입력받을때 import하는 클래스
		Scanner sc = new Scanner(System.in);
		String name;
		String age;
		int num1;
		int num2;
		//출력문으로 가이드
	
		System.out.print("이름입력>");
		name=sc.nextLine();//한줄을 문자로 읽기
		System.out.print("나이입력>");
		age=sc.nextLine();
		System.out.println("숫자 2개 입력");
		//num1=sc.nextInt(); //버퍼가 걸릴경우 라인으로 문자열로 형번환
		num1=Integer.parseInt(sc.nextLine());
		num2=sc.nextInt();
		System.out.println("[신상정보]");
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("두 수의 합: "+(num1+num2));
	}
}
