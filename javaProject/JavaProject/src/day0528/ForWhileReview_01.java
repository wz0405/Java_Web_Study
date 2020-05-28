package day0528;

public class ForWhileReview_01 {

	public static void test1() {
		int i=0;
		while(i<6) {
			System.out.println("I love Java"+i);
			i++;
		}
	}
	public static void test2() {
		for(int i=0;i<6;i++) {
			System.out.println("I love Java"+i);
		}
	}
	public static void test3() {
		int i=0;
		while(true) {
			System.out.println("I love Java"+i);
			i++;
			if (i>5) {
				break;
			}
		}
	}
	public static void test4() {
		int j=1;
		while(true) {
			System.out.println("Hi~JAVA"+j);
			j++;
			if (j>10) {
				break;
			}
		}
		System.out.println("종료");
	}
	public static void test5() {
		for(int i=1;i<11;i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("종료!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		test5();
	}
}
