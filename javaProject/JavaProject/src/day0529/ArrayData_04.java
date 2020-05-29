package day0529;

import java.util.Scanner;

public class ArrayData_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 미리지정없이..공간할당은 받을것..입력값을 출력
		Scanner sc = new Scanner(System.in);
		int data[]=new int[5];
		int sum=0;
		//값입력
		for(int i=0;i<data.length;i++) {
			System.out.println(i+1+"번 숫자를 입력하세요");
			data[i]=sc.nextInt();
			sum+=data[i];
		}
		System.out.println("숫자의합"+sum);
	}

}
