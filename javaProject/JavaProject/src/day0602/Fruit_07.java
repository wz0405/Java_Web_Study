package day0602;
//추상 클래스는 추상메서드를 하나만 가지고 있어도 추상클래스다.
abstract public class Fruit_07 {
	public static final String MESSAGE="오늘은 좋은날";
	//일반 메서드
	public void showtitle()
	{
		System.out.println("우리는 추상클래스를 공부합니다");
	}
	//몸통이 없고 선언부만 있는게 추상메서드
	//나중에 구현을 위해 미리 제목만 만들어둔다..오버라이딩이 목적
	abstract public void showMessage();
}
