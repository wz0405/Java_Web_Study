package day0601;

public class obTestA_03 {
	int a;
	static int b;
	
	public static void main(String[] args) {
		//같은클래스에서는 클래스명을 생략가능
		b=20;
		System.out.println(b);
		
		TestA_03 ab = new TestA_03();
		System.out.println(ab.name);
		//인스턴수변수와 헷갈리므로 클래스명.으로 호출하는게 더 바람직함
		System.out.println(ab.message);
		System.out.println(TestA_03.message);
		
	}
}

