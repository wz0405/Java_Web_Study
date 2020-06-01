package day0601;

public class Sangpum_16 {
	private String sangpum; //상품명
	private int su; //수량
	private int dan; //단가
	
	public void setData(String sangpum,int su, int dan) {
		this.sangpum=sangpum;
		this.su=su;
		this.dan=dan;
	}
	public void getData() {
		System.out.println("[상품정보]");
		System.out.println("상품명: "+this.sangpum);
		System.out.println("수량: "+this.su+"개");
		System.out.println("단가: "+this.dan+"원");
		System.out.println("=========================");
	}
}
