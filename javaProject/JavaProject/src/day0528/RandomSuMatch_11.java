package day0528;

import java.util.Scanner;

public class RandomSuMatch_11 {
	public static void main(String[] args) {
		int j=(int)(Math.random()*20)+1;
		Scanner sc = new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.println("숫자를 입력하세요");
			num=sc.nextInt();
			if (j<num) {
				System.out.println(num+"보다 작습니다.");
			}
			else if(j>num) {
				System.out.println(num+"보다 큽니다.");
				
			}
			else {
				System.out.println("맞았습니다 정답은"+j+"입니다");
				break;
			}
		}
	}
}
