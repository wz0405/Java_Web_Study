package day0528;

public class DoubleFor_07 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++) {
				if(j==5) break;
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	//중첩 for문
	//break에 둘이상의 반복문을 건너뛰거나 벗어나는것이 가능하다. (이름:)
}
