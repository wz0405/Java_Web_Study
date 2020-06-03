package day0603;

import java.util.Scanner;

public class SawonPayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int pay,gasu,timesu;
		
		System.out.println("사원명은?");
		name=sc.nextLine();
		System.out.println("기본급은?");
		pay=sc.nextInt();
		System.out.println("초과시간은?");
		timesu=sc.nextInt();
		System.out.println("총 가족수는?");
		gasu=sc.nextInt();
		
		Sawon sa = new Sawon(name,pay,timesu,gasu);
		System.out.println("사원명\t기본급\t시간수당\t가족수\t총급여");
		sa.getSawon();
		
	}
}
