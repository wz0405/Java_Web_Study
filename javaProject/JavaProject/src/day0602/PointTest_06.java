package day0602;

class Point{
	
	int x;
	int y;
	public Point() {
		System.out.println("슈퍼-디폴트 생성자 호출");
	}
	public Point(int x, int y) {
		System.out.println("슈퍼-인자있는 생성자");
		this.x=x;
		this.y=y;
	}
	public void write() {
		System.out.println("x좌표 "+x+" y좌표 "+y);
	}
}
class SubPoint extends Point{
	String msg;
	public SubPoint() {
		super();
		System.out.println("서브-디폴트생성자 호출");
	}
	public SubPoint(int x, int y, String msg) {
		super(x,y);
		this.msg=msg;
		System.out.println("서브-인자있는 생성자");
	}
	//오버라이딩 메소더
	//부모가 가진 메소드를 재구현함..미완의 메소드 완성
	@Override
	public void write() {
		super.write();
		System.out.println("메세지: "+msg);
	}
}
public class PointTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubPoint su = new SubPoint(1,2,"ok");
		su.write();
		SubPoint suq = new SubPoint();
		suq.write();
	}

}
