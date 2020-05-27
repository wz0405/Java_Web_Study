package day0527;

import java.util.Scanner;

public class IfTest_07 {
	public static void main(String[] args) {
	
		//수식?참:거짓
		Scanner sc = new Scanner(System.in);
		
		int x,y,max;
		System.out.println("**두개의 숫자를 입력해주세요**");
		x=sc.nextInt();
		y=sc.nextInt();
		
		/*
		 * if(x>=y) { max=x; } else { max=y; }
		 */		
		//삼항연산자
		max=x>=y?x:y;
		System.out.println("두 수중 더 큰 값은"+max);
	}
}
