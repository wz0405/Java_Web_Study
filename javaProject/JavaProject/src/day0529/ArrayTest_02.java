package day0529;

public class ArrayTest_02 {
	public static void main(String[] args) {
		String[] str;
		str=new String[4];
		
		str[0]="홍길동";
		str[1]="박";
		str[2]="지";
		str[3]="수";
		
		for(int j=0;j<str.length;j++) {
			System.out.println(str[j]);
		}
		for(String a:str) {
			System.out.println(a);
		}
	}
}
