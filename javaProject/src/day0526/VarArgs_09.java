package day0526;

public class VarArgs_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.변수...이름, 주소지, 나이 출력
		//String name="한현희";
		//String address="동작구";
		//int age=26;
		//1.변수를 출력시 지정
		String name=args[0];
		String address=args[1];
		String age=args[2];
		System.out.println("[신상정보]");
		System.out.println("이름 :"+name+"님");
		System.out.println("지역:"+address);
		System.out.println("나이:"+age+"세");
		
	}

}
