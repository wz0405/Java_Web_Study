package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
	//connection
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn=DriverManager.getConnection(url, "hhh", "1234");
			System.out.println("db연동 성공");
		} catch (SQLException e) {
			System.out.println("db연동 실패");
			e.printStackTrace();
		}
		return conn;
	}
	////insert
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, addr, sql; //insert sql작성을 위한 변수
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("주소를 입력하세요");
		addr=sc.nextLine();

		sql="insert into hello values(seq_h.nextval,'"+name+"', '"+addr+"',sysdate)";
		System.out.println(sql);
		
		//1.db연결
		Connection conn=null;
		
		//2.statement
		Statement stmt=null;
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			//sql문 전송에 필요한 statement객체를 createStatement 객체를 통해 얻는다.
			//sql문 실행...insert문
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("insert 에러 "+e.getMessage());
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbTest_01 db = new DbTest_01();
		//메인함수에 데이터 추가를 할수있게 조건문 지정
		Scanner sc = new Scanner(System.in);
		int n=0; //1,2,3,4,종료 선택할 변수
		
		while(true) {
			System.out.println("1.insert 2.select 3.delete 4. update 0.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				db.insert();
			else if(n==0)
			{
				System.out.println("종료");
				break;
			}
		}
		
	}

}
