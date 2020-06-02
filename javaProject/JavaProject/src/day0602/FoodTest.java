package day0602;
class Food{
	private String menu;
	private int price;
	
	static int menuno=1;

	//생성자 2개짜리 만든경우 get메서드 활용한 출력문
	public Food(String menu, int price){
		this.menu=menu;
		this.price=price;
	}
	public void getData(){
		System.out.println("메뉴_"+menuno);
		menuno++;
		System.out.println("메뉴명: "+this.menu);
		System.out.println("가격: "+this.price);
		System.out.println("------------------");
		
	}
	//디폴트 생성자인 경우 set메서드만들고 get메서드 만들기
}
public class FoodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food fo = new Food("스파게티",18000);
		fo.getData();
		Food fo1 = new Food("파스타",15000);
		fo1.getData();
	}

}
