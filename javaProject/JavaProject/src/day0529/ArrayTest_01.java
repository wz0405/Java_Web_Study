package day0529;

public class ArrayTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언
		//기본형 배열은 객체로 인식
		//int [] arr=new int[3];
		int arr[]=new int[3];
		String arr2[]=new String[5];
		
		arr[0]=10;
		arr2[2]="20";
		
		System.out.println(arr2[0]);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//for each 단순출력..순번못바꿈,,단순 출력일때 사용
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
