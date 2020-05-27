package day0527;

import java.util.Scanner;

public class IfTest_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int n = 5;
		 * 
		 * 
		 * if(n>=5) { System.out.println("n은 5보다 큽니다."); } else {
		 * System.out.println("n은 5보다 작습니다."); }
		 */
		//Q. 홀수면 홀수 짝수면 짝수
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		if (n%2==1) {
			System.out.println(n+"은 홀수입니다");
		}
		else {
			System.out.println(n+"은 짝수입니다");
		}
	}
}
