package day0601;
class Score{
	private String name;
	private int java;
	private int spring;
	
	static final String TITLE="중간고사 점수";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}
	//합계메서드
	public int getTot() {
		int num=0;
		num=this.java+this.spring;
		return num;
	}
	//평균메서드
	public double getAvg()
	{
		return getTot()/2.0;
	}
}
public class ScoreTest_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc = new Score();
		sc.setJava(50);
		sc.setSpring(79);
		System.out.println(Score.TITLE);
		System.out.println("합계"+sc.getTot()+"평균"+sc.getAvg());
		

	}

}
