package day0602;

class Shop{
	private String sangpum;
	private int price;
	private String color;
	
	//생성자
	public Shop(String s,int p,String c) {
		sangpum=s;
		price=p;
		color=c;
	}
	
	//제목 가로 나열
	public static void showTitle()
	{
		System.out.println("상품명\t단가\t색상");
		System.out.println("=====================");
	}
	
	//상품 출력
	public void getSangpum()
	{
		System.out.println(sangpum+"\t"+price+"\t"+color);
	}
	
}

public class ArrayConst_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop[]sh=new Shop[5]; //5개를 생성할거라는 주소만 할당(초기값null)
		
		//5개의 shop배열에 생성자를 통해서 생성
		sh[0]=new Shop("블라우스", 12000, "노랑");
		sh[1]=new Shop("청바지", 55000, "그린");
		sh[2]=new Shop("레깅스", 18000, "화이트");
		sh[3]=new Shop("져지", 44000, "블루");
		sh[4]=new Shop("치", 12000, "화이트");
		
		//출력
		Shop.showTitle();  //클래스명.메소드로 클래스메소드 호출가능
		for(int i=0;i<sh.length;i++)
		{
			sh[i].getSangpum();
		}
	}

}
