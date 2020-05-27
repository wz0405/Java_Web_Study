package day0526;


import java.util.Calendar;
public class CalTest_10 {
	public static void main(String[] args) {
		//Date date=new Date(); //권장하지 않음
		//import....클래스명.getInstance()
		//참조변수명.메서드로 필요한 메서드 활용
		Calendar cal=Calendar.getInstance();
	
		System.out.println("지금은"+cal.get(cal.YEAR)+"년도 입니다");
		System.out.println("지금은"+(cal.get(cal.MONTH)+1)+"월 입니다");
		System.out.println("오늘일자는"+ cal.get(cal.DAY_OF_MONTH)+"일 입니다");
		System.out.println("시간: "+cal.get(cal.HOUR_OF_DAY)+"시"+cal.get(cal.MINUTE)+"분"+cal.get(cal.SECOND)+"초");
	}
}
