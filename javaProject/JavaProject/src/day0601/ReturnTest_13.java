package day0601;

public class ReturnTest_13 {

	public static void main(String[] args) {
		divide(4,0);
	}
	public static void divide(int num1, int num2)
	{
		if(num2==0) {
			System.out.println("0으로는 나눌수 없습니다.");
			return;
		}
		else
			System.out.println("나눗셈의 결과: "+num1/num2);
	}
}
