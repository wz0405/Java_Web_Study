package day0601;

public class MethodReturn_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(square(3.0));

	}
	public static int add(int x,int y) {
		int result= x + y;
		return result;
	}
	public static double square(double num) {
		return num*num;
	}
}
