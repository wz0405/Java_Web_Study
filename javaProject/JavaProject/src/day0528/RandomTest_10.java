package day0528;

public class RandomTest_10 {
	public static void main(String[] args) {
		//Math.random() 한수는 0 이상 1 미만의 더블형 실수값을 반환
		
		//10개의 난수 발생
		for(int i=0;i<10;i++) {
			double j=Math.random();
			System.out.println(j);
		}
	}
}
//int n=(int)(Math.random()*m)+n;
//n~(m+n-1)
