package day0602;

public class InterEx1 extends InterABImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterABImpl in = new InterABImpl();
		in.play();
		in.draw();
		in.write();
		
		//다형성으로 생성해서 출력
		Inter_A int1 = new InterABImpl();
		int1.play();
		int1.draw();
	}

}
