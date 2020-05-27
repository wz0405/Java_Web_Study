package day0526;

public class DataType_04 {
	public static void main(String[] args) {
		//8개의 자료형
		boolean flag=false;
		char ch='A'; //기본적으로 정수형..아스키코드로 변경가능..소따옴표로 표현
		char ch2='a';
		byte num=-128;
		int num2=500000; //32bit
		long num3=8232332; //64bit
		double num4=42.23; //64bit
		float num5=1.123f; //뒤에 f 32bit
		System.out.println(flag);
		System.out.println(ch);
		System.out.println(ch+ch2);
		System.out.println(ch+2);
		//char로 캐스팅..바꾸려는 자료형이름(char)
		System.out.println((char)(ch+2));
		System.out.println(num+num2+num3+num4+num5);
	}
}
