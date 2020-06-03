package day0603;

public class ArrayIndexExp_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str= {"apple","banana"};
		System.out.println("차례대로출력");
//		try {
//			for(int i=0;i<=str.length;i++) {
//				System.out.println(str[i]);
//			}
//		}catch (ArrayIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			//excption시 발생하는 코드
//			System.out.println(e.getMessage());
//		}
		
		for(int j=str.length;j>=0;j--) {
			try {
			System.out.println(str[j]);
			}catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
		}
	}

}
