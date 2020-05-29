package day0529;

import java.util.Scanner;

public class ForWhileReview {

	public static void num1() {
		for(int j=1;j<=10;j++) {
			if(j%3==0) {
				continue;
			}
			System.out.print(j+" ");
		}
	}
	public static void num2() {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~"+num+"까지의 합은"+sum+"입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num1();
		num2();
	}

}
