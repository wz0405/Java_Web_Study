package java6;

class Sum{
	int n=0;
	void method() {
		for (int i =0 ; i<=50; i++) {
			n+=i;
			
		}
		System.out.println(n);
	}
}
class Sum2{
	int n=0;
	void method() {
		for (int i =0 ; i<=10; i=i+2) {
			n+=i;
			
		}
		System.out.println(n);
	}
}
class Test3{
	int sum =0;   	// ÃÑÁ¡
	float average = 0f;	// Æò±Õ
	int[] score = {100, 88, 100, 100, 90};
	void sum() {
		for (int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("ÇÕÀº"+sum);
	}
	float av() {
		return sum/5.0f;
		
	}

}
class Test4{
	int[] num = { 55, 66, 77, 54, 100, 85, 95};
	void sort() {
		  for (int i = 0; i < num.length; i++) {
			  for (int j = i+1; j < num.length; j++) {
				  if (num[i] > num[j]) {
					  int temp = num[j];
					  num[j] = num[i];
					  num[i] = temp;
					  } 
				  else break;
              }
		  }
		  for(int sort:num) {
			  System.out.print(sort+" ");
		  }
	}
	void maxi() {
		System.out.println("ÃÖ´ñ°ª"+num[num.length-1]);
	}
	void mini() {
		System.out.println("ÃÖ¼Ú°ª"+num[0]);
	}
}


public class Review0605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		s.method();
		Sum2 s1 = new Sum2();
		s1.method();
		Test3 s2 = new Test3();
		s2.sum();
		System.out.println("Æò±ÕÀº"+s2.av());
		Test4 s3 = new Test4();
		s3.sort();
		System.out.println();
		s3.maxi();
		s3.mini();
		

	}

}
