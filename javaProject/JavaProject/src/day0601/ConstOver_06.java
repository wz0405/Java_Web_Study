package day0601;

class Apple{
	//디폴트 생성자
	public Apple() {
		System.out.println("디폴트 생성자 호출 apple");
	}
}
class Banana{
	public Banana(String str) {
		System.out.println("생성자 호출 "+str);
	}
}
class Orange{
	public Orange() {
		System.out.println("오렌지 디폴트 생성자");
		
	}
	public Orange(String str) {
		System.out.println("오렌지 두번째 생성자 "+str);
	}
	public Orange(int n) {
		System.out.println("오렌지 세 번째 생성자 "+n);
	}
	public Orange(String str, int n) {
		System.out.println("오렌지 네 번째 생성자 "+str+n);
	}
}
public class ConstOver_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap=new Apple();
		Banana ba =new Banana("바나나");
		Orange or = new Orange("s",1);
	}

}
