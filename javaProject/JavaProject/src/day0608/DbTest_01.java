package day0608;

public class DbTest_01 {
	//����̹�, url
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	public DbTest_01() {
		try {
			Class.forName(driver);
			System.out.println("����Ŭ ����̹� ����!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����Ŭ ����̹� ����");
		}
	}
	/////////�����ڵ� �޼���
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbTest_01 db = new DbTest_01();
	}

}
