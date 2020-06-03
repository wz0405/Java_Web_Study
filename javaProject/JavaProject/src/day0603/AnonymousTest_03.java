package day0603;
abstract class AbstEx{
	abstract public void show();
}
//////////////////////
class OuterEx{
	//생성과 동시에 만들어지는 클래스
	AbstEx ab=new AbstEx() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("익명내부 클래스");
		}
	};
}
/////////////////////
public class AnonymousTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterEx ou = new OuterEx();
		//외부참조변수명.익명내부클래스의 참조변수명.으로 호출
		//생성생략..
		ou.ab.show();
	}

}
