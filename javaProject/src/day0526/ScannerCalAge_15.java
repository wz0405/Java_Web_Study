package day0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerCalAge_15 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String name;
		String year;
		System.out.print("이름입력:");
		name=sc.nextLine();
		System.out.print("태어난 연도 입력:");
		year=sc.nextLine();
		System.out.println("===============");
		System.out.println("신상정보");
		System.out.println("이름:"+name);
		int inyear=Integer.parseInt(year);
		int curYear=cal.get(Calendar.YEAR);
		System.out.println("현재 나이: "+(curYear-inyear+1));
				
	}
}
