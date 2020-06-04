package day0604;

import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_03 {
	
	
	Vector<BoardDTO_3>list = new Vector<BoardDTO_3>();
	//1. 입력을 누를때의 경우에 해당하는 메소드
	public void setBoard() {
		Scanner sc=new Scanner(System.in);
		String name,subject,content;
		System.out.println("작성자는?");
		name=sc.nextLine();
		System.out.println("제목은?");
		subject=sc.nextLine();
		System.out.println("내용은?");
		content=sc.nextLine();
		
		BoardDTO_3 data = new BoardDTO_3(name, subject, content);
		//벡터에 담는다
		list.add(data);
		System.out.println("현재 데이타갯수: "+list.size()+"개");
	}
	//2. 출력을 누를때의 경우에 해당하는 메소드
	public void getBoard() {
		System.out.println("***게시판***");
		System.out.println("----------------------");
		for (int i=0;i<list.size();i++) {
			//리스트내의 지정된 위치에 있는 요소값을 돌려준다
			BoardDTO_3 b= list.get(i);
			System.out.println("No. "+(i+1)+"작성자: "+b.getName());
			System.out.println("제목: "+b.getSubject());
			System.out.println("내용: "+b.getContent());
			System.out.println("---------------------");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorBoard_03 ve = new VectorBoard_03();
		int n=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1번은 출력 2번은 입력 0번은 종료입니다.");
			n=sc.nextInt();
			if(n==2) {
				ve.setBoard();
			}
			else if(n==1) {
				ve.getBoard();
			}
			else if(n==0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
