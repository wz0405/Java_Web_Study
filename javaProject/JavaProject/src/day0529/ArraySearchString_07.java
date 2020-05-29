package day0529;

import java.util.Scanner;

public class ArraySearchString_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String data[]= {"가","나","다","라","마","바","사","아","자"};
		String num="";
		boolean ch=false;
		//숫자를 입력해서 그 숫자가 data안에 있는지
		//없으면 없다고 표시, 있으면 몇번째 있는지
		//0입력시 종료
		while(true) {
			System.out.println("검색할 문자열을 입력하세요");
			num=sc.nextLine();
			for (int i=0;i<data.length;i++) {
				if(data[i].equals(num)) {
				ch=true;
				System.out.println("값을 찾았습니다. 값은"+i+"번째에 있습니다");
				}
			}
			if(num.equals("Q") || num.equals("q")) {
				System.out.println("탐색을 종료합니다.");
				break;
			}
			if(!ch)
				System.out.println("데이터에 없음");
			
		}
			
	}
}
		
