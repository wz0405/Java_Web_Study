package day0601;

class Member{
	String name;
	public Member(String name) {
		this.name=name;
		System.out.println("내이름은 "+this.name+"입니다");
	}
}
public class ConstTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member me = new Member("한현희");
		Member me2 = new Member("박지수");
		Member me3 = new Member("한명희");
	}

}
