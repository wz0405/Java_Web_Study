package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
	/////select
	public void select() {
		System.out.println("시퀀스\t이름\t주소\t현재날짜");
		System.out.println("------------------------------");
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; //조회할때 테이블형태로 출력해주는 객체
		String sql="select * from hello order by num desc";//오름차순으로 출력
		
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//select문을 요청하므로 executeQuery메소드를 이용해서 Resultset객체로 값을 얻는다.
			
			//2개이상의 값을 얻고자 할때 while
			while(rs.next()) { //다음값을 찾으면 true값 반환
				
				//rs의 next를 이용해서 행을 선택하고, get메소드를 이용해서 테이블의 컬럼값을 얻는다.
				System.out.println(rs.getInt("num") //숫자형태("컬럼명")
				+"\t"+rs.getString("name") //문자열("컬럼명")
				+"\t"+rs.getString("addr")
				+"\t"+rs.getDate("sdate")); //날짜("컬럼명")
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String sql; //insert sql작성을 위한 변수
		int num;
		System.out.println("몇 번의 데이터를 삭제하시겠습니까?");
		num=sc.nextInt();

		sql="delete from hello where num="+num;
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
			int a = stmt.executeUpdate(sql); //성공한 레코드 개수 반환
			if(a==0) System.out.println("없는 데이터 번호입니다"); //없는 번호 입력시 실제 삭제안됨 > 0 반환
			else
				System.out.println("삭제되었습니다"); //삭제되면 1이 반환
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
	public void update() {
		Scanner sc = new Scanner(System.in);
		String sql,name,addr; //insert sql작성을 위한 변수
		int num;
		System.out.println("몇 번의 데이터를 수정하겠습니까?");
		num=sc.nextInt();
		sc.nextLine();
		System.out.println("수정할 이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("수정할 주소를 입력하세요");
		addr=sc.nextLine();

		sql="update hello set name='"+name+"',addr='"+addr+"'where num="+num;
		System.out.println(sql);
		//1.db연결
		Connection conn = null;
		//2.statement
		Statement stmt = null;
		
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			int a = stmt.executeUpdate(sql);
			if(a==0) System.out.println("없는 데이터 번호입니다"); //없는 번호 입력시 실제 삭제안됨 > 0 반환
			else
				System.out.println("변경되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			else if(n==2) {
				db.select();
			}
			else if(n==3) {
				db.delete();
			}
			else if(n==4) {
				db.update();
			}
		}
		
	}

}
