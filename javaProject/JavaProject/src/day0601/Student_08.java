package day0601;

public class Student_08 {
	
	//인스턴스가 private이면 메인에서 생성을 해도 참조변수로 접근이 불가능하다
	//그래서 반드시 접근가능한 메서드가 필수
	//set은 수정용도 get은 값 출력용도로 만든다
	private String name;
	private int age;
	//set메서드
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//get메서드
	//get은 수정된 값을 돌려주는 메서드.조회목적
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
