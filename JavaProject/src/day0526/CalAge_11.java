package day0526;

import java.util.Calendar;

public class CalAge_11 {
	public static void main(String[] args) {
		String name="한현희";
		//현재 년도가 필요...Calendar import
		//계산
		//출력
		int myYear=1995;
		Calendar cal = Calendar.getInstance();
		int curYear=cal.get(Calendar.YEAR);
		System.out.println("이름: "+name+" 남");
		System.out.println("나이: "+(curYear-myYear+1));
	}
}
