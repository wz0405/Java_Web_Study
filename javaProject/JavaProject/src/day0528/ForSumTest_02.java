package day0528;

public class ForSumTest_02 {
	public static void sumTest1() {
		int i=0,sum=0;
		for(i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void sumTest2() {
		int sum=0;
		for(int i=1;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//sumTest1();
		sumTest2();
	}
}
