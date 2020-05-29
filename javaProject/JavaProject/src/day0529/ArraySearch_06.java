package day0529;

import java.util.Scanner;

public class ArraySearch_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int data[]= {5,1,512,52,34,124,1233,16,85,32,74};
		int num=0;
		boolean ch=false;
		//숫자를 입력해서 그 숫자가 data안에 있는지
		//없으면 없다고 표시, 있으면 몇번째 있는지
		//0입력시 종료
		while(true) {
			System.out.println("검색할 숫자를 입력하세요");
			num=sc.nextInt();
			for (int i=0;i<data.length;i++) {
				if(data[i]==num) {
				ch=true;
				System.out.println("값을 찾았습니다. 값은"+i+"번째에 있습니다");
				}
			}
			if(num==0) {
				System.out.println("탐색을 종료합니다.");
				break;
			}
			if(!ch)
				System.out.println("데이터에 없음");
			
		}
			
	}
}
		
