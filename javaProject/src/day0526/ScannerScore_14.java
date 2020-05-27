package day0526;

import java.util.Scanner;

public class ScannerScore_14 {
	public static void main(String[] args) {
		String name;
		String ko;
		String ma;
		String en;
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은?");
		name=sc.nextLine();
		System.out.print("국어점수는?");
		ko=sc.nextLine();
		System.out.print("수학점수는?");
		ma=sc.nextLine();
		System.out.print("영어점수는?");
		en=sc.nextLine();
		
		System.out.println("===============");
		System.out.println("이름: "+name);
		System.out.println("국어점수: "+ko);
		System.out.println("수학점수: "+ma);
		System.out.println("영어점수: "+en);
		
		System.out.println("---------------");
		int num1=Integer.parseInt(ko);
		int num2=Integer.parseInt(ma);
		int num3=Integer.parseInt(en);
		int avg=(num1+num2+num3)/3;
		System.out.println("평균: "+avg);
		
	}
}
