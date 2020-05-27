package day0526;

public class ArgsTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***배열의 매개 변수테스트***");
		System.out.println("첫번째 값:"+args[0]); //배열의 index는 0번부터 시작
		System.out.println("두번째 값:"+args[1]);	
		//숫자로 형변환해서 계산하기
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
	}

}
