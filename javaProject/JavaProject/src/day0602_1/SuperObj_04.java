package day0602_1;

public class SuperObj_04 {
	protected String name;
	protected int age;
	//생성자
	public SuperObj_04() {} //디폴트 생성자 생성..상속받는 자식클래스에서 참조할 수 있음
	public SuperObj_04(String name, int age) {
		this.name=name;
		this.age=age;
	}
}
