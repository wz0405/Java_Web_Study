package day0604;
import java.util.Scanner;
import java.util.Vector;

public class VectorScore {

	//테이블형태의 값을 담을수 있는 꾸러미
	//꾸러미에 클래스를 담았다....그럼 꺼낼때도 클래스
Vector<ScoreDTO>list=new Vector<ScoreDTO>(); 
	
//1.시험입력을 눌렀을때 실제 이름,성적2개를 입력할 메소드
	public void setScore()
	{
		Scanner sc=new Scanner(System.in);
		
		String name;
		int java,spring;
		
		System.out.println("학생이름은?");
		name=sc.nextLine();
		System.out.println("자바점수는?");
		java=sc.nextInt();
		System.out.println("스프링점수는?");
		spring=sc.nextInt();
		
		//DTO클래스를 생성
		ScoreDTO dto=new ScoreDTO(name, java, spring);
		list.add(dto); //벡터꾸러미에 ScoreDTO 를 담겠다
	}
	
	
	//2.시험성적출력
	public void getScore()
	{
		System.out.println("[시험성적 결과]");
		ScoreDTO.title();  //static메소드로 제목출력....출력문한줄 더넣어도 상관없다
		System.out.println("===========");
		
		for(int i=0;i<list.size();i++)
		{
			ScoreDTO s=list.get(i);
			
			System.out.println(i+1+"\t"+s.getName()+"\t"+s.getJava()+"\t"+s.getSpring()+"\t"+s.getAvg()+"\t"+s.getPeonga());
			System.out.println("-----------");
		}
	}

	
	public static void main(String[] args) {
		
		//생성..1.시험입력 2.시험출력 메소드를 만든곳이 VectorScore 이므로 생성해야된다
		VectorScore vs=new VectorScore();
		
		Scanner sc=new Scanner(System.in);
		
		int n=0; //1,2,9 번 누를거 선택할 변수
		
		while(true) 
		{
		
			System.out.println("1.시험성적입력   2.시험성적출력   9.종료");
			n=sc.nextInt();
		
			if(n==1)
				vs.setScore();
			else if(n==2)
				vs.getScore();
			else if(n==9)
			{
				System.out.println("종료합니다");
				break;
			}
		}
		
		
	}

	}
