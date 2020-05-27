package day0527;

import java.util.Scanner;

public class IfTest_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int java,jsp,spring;
		double avg;
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("세과목의 점수를 차례로 입력하세요");
		java=sc.nextInt();
		jsp=sc.nextInt();
		spring=sc.nextInt();
		
		//계산
		avg=(java+jsp+spring)/3.0;
		System.out.println("3과목의 점수:"+java+","+jsp+","+spring);
		System.out.println("평균:"+avg);
		System.out.println("합격조건은 평균 60점 이상이고 각 과목 모두 40점 이상입니다");
		
		if (avg>=60 && java>=40 && jsp>=40 && spring>=40) {
			System.out.println(name+"님은 합격입니다");
		}
		else {
			System.out.println(name+"님은 불합격입니다");
		}
	}
}
