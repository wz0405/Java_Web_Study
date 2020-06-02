package day0602_1;

import day0602.InstTest;
public class InstConst_03 {

	public static void main(String[] args) {
		//InstTest t1 = new InstTest(); //오류.. 프라이빗이라서 패키지가 드를경우 생성이 안됨
		InstTest t1=InstTest.getInstance();
		t1.writeMessage();
	}
}
