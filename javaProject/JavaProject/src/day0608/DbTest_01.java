package day0608;

public class DbTest_01 {
	//드라이버, url
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	public DbTest_01() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 실패");
		}
	}
	/////////생성자도 메서드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbTest_01 db = new DbTest_01();
	}

}
