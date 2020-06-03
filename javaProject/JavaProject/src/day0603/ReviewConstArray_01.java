package day0603;

class Score{
	private String name;
	private String age;
	private int java;
	private int jsp;
	
	static int no;
	
	//생성자4개
	public Score(String name,String age,int java,int jsp) 
	{
		this.name=name;
		this.age=age;
		this.java=java;
		this.jsp=jsp;
	}
	
	
	
	public static void title()
	{
		System.out.println("번호\t이름\t나이\tjava\tjsp\t합게\t평균");
		System.out.println("======================================================");
	}
	
	public int getTot() 
	{
		int tot=java+jsp;
		return tot;
	}
	
	public double getAvg()
	{
		double avg=getTot()/2.0;
		return avg;
	}
	
	public void getScore()
	{
		no++;
		System.out.println(no+"\t"+name+"\t"+age+"세\t"+java+"점\t"+jsp+"점\t"+getTot()+"점\t"+getAvg()+"점");
		System.out.println("----------------------------------------------------------");
		
	}
}



public class ReviewConstArray_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//배열
		Score[]sc=new Score[5];
		sc[0]=new Score("이지선", "22", 88, 99);
		sc[1]=new Score("김희애", "33", 100, 65);
		sc[2]=new Score("박선영", "32", 77, 68);
		sc[3]=new Score("김선아", "44", 79, 87);
		sc[4]=new Score("박지선", "34", 88, 66);
		
		
		Score.title();
		for(int i=0;i<sc.length;i++)
		{
			sc[i].getScore();
		}

	}

}
