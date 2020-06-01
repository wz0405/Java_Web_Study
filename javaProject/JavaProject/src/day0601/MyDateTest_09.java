package day0601;
class MyDate{
	//인스턴스변수
	int year;
	int month;
	int day;
	
	//생성자 3개짜리..명시적 생성자
	//명시적생성자 만들면 디폴트 안만들어짐
	public MyDate(int y, int m, int d) {
		year=y;
		month=m;
		day=d;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
public class MyDateTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate my=new MyDate(2020,5,30);
		System.out.println(my.getDay());
	}

}
