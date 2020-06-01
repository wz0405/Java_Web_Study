package day0601;

public class Counter_02 {
	int count=0; //인스턴스 변수는 서로 다른 메모리를 가짐
	
	public Counter_02() {
		count++;
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter_02 cot1=new Counter_02();
		Counter_02 cot2=new Counter_02();
	}

}
