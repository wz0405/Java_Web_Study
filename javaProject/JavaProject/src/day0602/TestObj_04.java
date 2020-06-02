package day0602;

import day0602_1.SuperObj_04;

class SubObj_04 extends SuperObj_04{
	private String addr;
	public SubObj_04(){
		super(); //디폴트 생성자 만들때 super()가 자동으로 먼저 나오므로 슈퍼에서 디폴트 생성자 만들어 에러방지
	}
	public SubObj_04(String name, int age, String addr) {
		super(name, age);
		this.addr=addr;
		// TODO Auto-generated constructor stub
	}
	public void writeData() {
		System.out.println("이름 :" +name);
		System.out.println("나이 :" +age);
		System.out.println("주소 :" +addr);
	}

}
///////////////////////////////
public class TestObj_04 {

	public static void main(String[] args) {
		SubObj_04 su = new SubObj_04("이효리",33,"제주");
		su.writeData();
	}

}
