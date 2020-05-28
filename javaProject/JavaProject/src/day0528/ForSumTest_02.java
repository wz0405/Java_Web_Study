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
	public static void sumTest3() {
		int sum=0;
		int i=0;
		for(;i<=10;i++) {
			sum+=i;
		}
		System.out.println(i-1+"까지의 합은"+sum);
	}
	public static void sumTest4() {
		int i=0;
		int sum=0;
		while(true) {
			sum+=i;
			i++;
			if (i>100) {
				break;
			}
		}
		System.out.println("1-100 까지의 합은"+sum);
	}
	public static void main(String[] args) {
		//sumTest1();
		//sumTest2();
		//sumTest3();
		sumTest4();
	}
}
