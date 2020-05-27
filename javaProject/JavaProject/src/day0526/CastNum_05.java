package day0526;

public class CastNum_05 {
	public static void main(String[] args) {
		/*byte a=127;
		byte b=(byte)128;
		System.out.println(a);
		System.out.println(b); //디모션..더작은 자료형으로의 변환..값손실
*/		
		char a='A';
		int b=(int)a;
		System.out.println(a);
		System.out.println(b);
		double d=10.5;
		//숫자끼리의 형변환은(자료형)을 맞춰준다
		int c=(int)d; //디모션됨
		System.out.println(c);
	}
}
