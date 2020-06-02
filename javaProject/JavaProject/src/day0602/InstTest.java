package day0602;


public class InstTest {

	private InstTest() {
		System.out.println("디폴트생성자");
	}
	//생성자 대신에 인스턴스를 반환하는 메소드
	public static InstTest getInstance()
	{
		return new InstTest();
	}
	public void writeMessage()
	{
		System.out.println("안녕하세요.");
	}

}
