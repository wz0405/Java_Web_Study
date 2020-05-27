package day0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScanQuiz_16 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String name;
		int year;
		String phone;
		String address;
	
		System.out.print("태어난 연도는?");
		year=Integer.parseInt(sc.nextLine());
		//sc.nectLine 엔터를 먼저 읽어서 없애준다
		System.out.print("이름은?");
		name=sc.nextLine();
		System.out.print("핸드폰 번호는?");
		phone=sc.nextLine();
		System.out.print("주소는?");
		address=sc.nextLine();
		int curYear=cal.get(Calendar.YEAR);
		System.out.println("===============");
		System.out.println("이름:"+name);
		System.out.println("태어난 연도:"+year);
		System.out.println("현재 나이: "+(curYear-year+1));
		System.out.println("전화 번호:"+phone);
		System.out.println("주소:"+address);
		
				
	}
}
