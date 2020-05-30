package day0529;

import java.util.Scanner;

public class Array2CharBinggo_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//3행3열의 빙고판을 생성
		int [][]pz=new int[3][3];
		int binggo; //빙고개수출력
		String ans;
		
		//3행3열의 배열에 1~3사이의 난수를 발생시킨다
		
		while(true) {
			System.out.println("***같은숫자 나오면 빙고***");
			
			//난수구하기
			for(int i=0;i<pz.length;i++) 
			{
				for(int j=0;j<pz[i].length;j++)
				{
					//난수
					pz[i][j]=(int)(Math.random()*3)+1;
					
				}
			}
			
			//출력
			for(int i=0;i<pz.length;i++) 
			{
				for(int j=0;j<pz[i].length;j++)
				{
					//출력
					System.out.printf("%4d",pz[i][j]);
				}
				System.out.println();
			}
			
			//빙고개수 구하기
			binggo=0;
			
			//가로선비교
			for(int i=0;i<3;i++)
			{
				if(pz[i][0]==pz[i][1] &&pz[i][1]==pz[i][2])
					binggo++;
			}
			//세로선 비교
			for(int i=0;i<3;i++)
			{
				if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i])
					binggo++;
			}
			// 대각선\비교
			if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2])
				binggo++;
			
			//대각선/비교
			if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0])
				binggo++;
			
			System.out.println("빙고: "+binggo+"개");
			
			//break문
			System.out.println("계속(c),그만(x)");
			ans=sc.nextLine();
			
			if(ans.equalsIgnoreCase("x"))
			{
				System.out.println("게임을 종료합니다");
				break;
			}else if(ans.equalsIgnoreCase("c"))
			{
				System.out.println("계속....");
			}else {
				System.out.println("잘못입력...강제종료");
				break;
			}
			
			
		}
		
	}

}


