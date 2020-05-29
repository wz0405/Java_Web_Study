package day0529;

public class ArrayMaxMin_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에서 최대값 최소값 구하기
		int data[]= {5,123,13,1,2,-1,6,42};
		//첫번재 데이타를 무조건 최대값으로 저장
		int max=data[0];
		//두번째 데이타 끝까지 max와 비교
		for(int i=1;i<data.length;i++) {
			if (max<data[i]) {
				max=data[i];
			}
		}
		System.out.println("최대값은"+max);
		int min=data[0];
		for(int i=1;i<data.length;i++) {
			if (min>data[i]) {
				min=data[i];
			}
		}
		System.out.println("최솟값은"+min);
	}

}
