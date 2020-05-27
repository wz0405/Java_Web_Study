package day0527;

public class OperTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=b=5;
		//단항일 경우에는 앞에 붙이나 뒤에 붙히나 똑같음
		++a; 
		b++; //b=b+1
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//수식에서 사용할때는 전치, 후치 결과값이 틀리다.
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //후치일경우에는 먼저 대입후 증가.
		System.out.println("m="+m+", a="+a);
		n=++b; //전치일경우에는 먼저 증가후 대입.
		System.out.println("n="+n+", b="+b);
	}

}
