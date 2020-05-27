package day0527;

import java.util.Scanner;

public class QuizIfScan_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String grade;
		System.out.println("점수"+score);
		if (score>=90){
			System.out.println("평가메세지:참 잘했어요");
			grade="A";
		}
		else if (score>=80) {
			System.out.println("평가메세지:좀 더 노력하세요");
			grade="B";
		}
		else {
			System.out.println("평가메세지:다음기회에..");
			grade="C";
		}
		System.out.println("학점:"+grade);
		
		
	}
	
	
}
