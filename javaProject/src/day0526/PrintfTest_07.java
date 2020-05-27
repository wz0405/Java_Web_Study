package day0526;

public class PrintfTest_07 {
	public static void main(String[] args) {
		//printf: %d-정수 %s-문자
		//변수
		int num1=50,num2=30;
		int result=num1+num2;
		System.out.printf("숫자1은 %d이고, 숫자 2는 %d입니다 그 합은 %d입니다.\n",num1,num2,result);
		System.out.println("***println으로 출력***");
		System.out.println("숫자1은 "+num1+"이고, 숫자 2는"+num2+"입니다 그 합은"+result+"입니다");
	}
}
