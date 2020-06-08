package java6;

import java.util.*;


public class VectorMember {
	Vector<Member>list = new Vector<Member>();
	public void setData() {
		Scanner sc = new Scanner(System.in);
		String name;
		String phone;
		int num;
		System.out.println("고객명?");
		name=sc.nextLine();
		System.out.println("전화번호?");
		phone=sc.nextLine();
		System.out.println("구매금액?");
		num=sc.nextInt();
		
		Member me = new Member(name,phone,num);
		list.add(me);
	}
	public void getData() {
		int cnt=1;
		System.out.println("[고객 vip 정보]");
		System.out.println("No\t이름\t전화번호\t구매금액\t등급");
		System.out.println("---------------------------");
		for(int i=0;i<list.size();i++)
		{
			Member s=list.get(i);
			
			System.out.println(i+1+"\t"+s.getName()+"\t"+s.getNumber()+"\t"+s.getMoney()+"\t"+s.check());
			System.out.println("---------------------------");
		}
	}
	
	public static void main(String[] args) {
		VectorMember ve = new VectorMember();
		Scanner sc = new Scanner(System.in);
		String temp;
		while(true) {
			System.out.println("가.명단입력   나.명단출력   다.종료");
			temp=sc.nextLine();
			if(temp.equals("가")){
				ve.setData();
			}
			else if(temp.equals("나")) {
				ve.getData();
			}
			else if(temp.equals("다")) {
				System.out.println("종료");
				break;
			}
		}
	}
}
