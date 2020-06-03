package day0603;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputStream: 바이트단위입력 최상위 클래스-추상클래스이므로 객체르 직접못만드므로
		//자식클래스가 받아서 직접구현
		//read(): 한바이트만 읽는다.
		//read(byte[] b)-사용자가 지정한 바이트를 이용해서 한꺼번에 원하는 만큼 읽는다.
		
		InputStream	is=System.in;
		int a=0;
		System.out.println("한글자 입력: ");
		
		try {
			a=is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("오류: "+e.getMessage());
		}
		System.out.println("3초뒤에 출력합니다");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력값 :"+(char)a);
	}

}
