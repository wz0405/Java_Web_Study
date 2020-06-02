package day0602;

public class FruitTest_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자식클래스로 생성
		//평상시의 보편적 생성....
		//참조변수가 너무 많음
//		Apple_07 ap1 = new Apple_07();
//		ap1.showMessage();
//		ap1.showtitle();
//		
//		Orange_07 or1 = new Orange_07();
//		or1.showMessage();
//		or1.showtitle();
//		
//		Banana_07 ba1 = new Banana_07();
//		ba1.showMessage();
//		ba1.showtitle();
		
		//다형성으로 객체생성하여 출력
		Fruit_07 fr;
		fr=new Apple_07();
		fr.showMessage();
		fr.showtitle();
		
		fr=new Orange_07();
		fr.showMessage();
	}

}
