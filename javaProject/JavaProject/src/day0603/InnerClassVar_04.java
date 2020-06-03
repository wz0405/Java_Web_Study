package day0603;
class Outer{
	int a=10;
	static int b=20;
	
	class Inner{
		int c=30;
		//static int d=100; 내부에서는 static 못씀
		//출력메소드_내부
		public void write() {
			System.out.println("외부변수 a="+a);
			System.out.println("외부 정적변수 b="+b);
			System.out.println("내부 변수c="+c);
			System.out.println("내부 정적변수는 불가능");
		}
	}
}
public class InnerClassVar_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner ou = new Outer().new Inner();
		ou.write();
	}

}
