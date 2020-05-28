package day0528;

import java.util.Scanner;

public class ForGuGu_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan=0;
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("몇단?");
			dan=sc.nextInt();
			if (dan>=2 && dan<=9) {
				System.out.println(dan+"단");
				for (int i=1;i<=9;i++) {
					System.out.println(dan+"x"+i+"="+dan*i);
					}
				System.out.println("");
			}
			else if(dan==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}

}
