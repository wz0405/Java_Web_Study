package day0601;

class Card{
	//인스턴스 변수
	//각 인스턴스의 개별적인 저잘곤간 각각 다른값 저장가능
	//참조변수명. 으로 접근가능
	String kind; //카드 무늬
	int number; //카드의 숫자
	
	
	//클래스 변수..static변수
	//모든인스턴스들이 공유..클래스가 로딩될때 생성 종료될때 소멸
	//클래스명.변수명으로 접근가능
	static int width,height;
}
public class CardTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card cd = new Card();
		cd.kind="50";
		cd.number=20;
	
		Card.width=50;
		Card.height=80;
		System.out.println(Card.width);
		System.out.println(Card.height);
		System.out.println(cd.kind);
		System.out.println(cd.number);
		Card cd2 =new Card();
		cd2.kind="space";
		cd2.number=7;
		System.out.println(cd2.kind+cd2.number);
	}

}
