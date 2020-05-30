package day0529;

public class Array2Char_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=10;
		arr[1][1]=20;
		arr[1][2]=30;
		arr[2][0]=10;
		arr[2][1]=20;
		arr[2][2]=30;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
