package day0603;
class OuterObj{
	class InnerClass{
		public void write()
		{
			System.out.println("내부클래스의 메소드");
		}
	}
	//외부클래스의메소드
	public void disp()
	{
		System.out.println("외부클래스의 메소드");
		System.out.println("외부에서 내부클래스 메소드 호출");
		InnerClass in = new InnerClass();
	
		in.write();
	}
}
public class InnerClassTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부(일반적)
		OuterObj ou = new OuterObj();
		ou.disp();
		//내부클래스의 메소드는 외부통애서만 가능하다.
		OuterObj.InnerClass obj = new OuterObj().new InnerClass();
		obj.write();
	}

}
