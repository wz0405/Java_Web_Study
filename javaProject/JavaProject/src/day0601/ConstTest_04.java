package day0601;

class Number{
	int num=0;
	//생성자
	public Number() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자 호출");
	}
	public Number(int num) {
		this.num=num; //이름이 같은경우 this.num 인스턴스 변수명 설정 
		System.out.println("생성자 호출");
	}
	public int getNumber() {
		num=100;
		return num;
	}
}
public class ConstTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인메서드에서는 인스턴스가 생성될때마다 생성자 자동호출
		Number cd = new Number(1);
		Number cd1= new Number();
		System.out.println(cd1.num);
		System.out.println(cd.num);
		
		//디폴트 생성자 생성해서 메서드 가져오기
		System.out.println(cd.getNumber());
		
	}
	

}
