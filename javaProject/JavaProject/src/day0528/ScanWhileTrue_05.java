package day0528;

import java.util.Scanner;

public class ScanWhileTrue_05 {

	public static void main(String[] args) {
		int num;
		int sum=0;
		// TODO Auto-generated method stub
		System.out.println("합계를 구할 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int s=num;
		System.out.println("---------------------");
		while(true) {
			sum+=num;
			num--;
			if (num==0) break;
		}
		System.out.println("1~"+s+"까지의 합은"+sum+"입니다");
		
	}

}
