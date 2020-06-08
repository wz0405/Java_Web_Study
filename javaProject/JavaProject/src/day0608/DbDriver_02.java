package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbDriver_02 {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	public DbDriver_02() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("오라클 드라이버 실패");
			e.printStackTrace();
		}
	}
	//커넥션,스테이트먼트 인터페이스를 가져와야함
	//커넥션을 해야 url,계정,비밀번호를 인지를 하고 sql 입력 시  판단함
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn=DriverManager.getConnection(url, "hhh", "1234");
			System.out.println("db연동 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db연동 실패");
			e.printStackTrace();
		}
		return conn;
		
	}
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name,age,addr,sql;
		System.out.println("이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("나이를 입력하세요");
		age=sc.nextLine();
		System.out.println("주소를 입력하세요");
		addr=sc.nextLine();
		
		sql="insert into member values(seq_m.nextval,'"+name+"','"+age+"','"+addr+"',sysdate)";
		System.out.println(sql);
		Connection conn=null;
		Statement stmt = null;
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("insert 완료");
		} catch (SQLException e) {
			System.out.println("insert 에러 "+e.getMessage());
			
		} finally {
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
		int num;
		String sql,name,age,addr;
		System.out.println("변경할 데이터의 번호를 입력하세요");
		num=sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("변경할 나이를 입력하세요");
		age=sc.nextLine();
		System.out.println("변경할 주소를 입력하세요");
		addr=sc.nextLine();
		
		sql="update member set name='"+name+"',age='"+age+"',addr='"+addr+"' where no="+num;
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt = null;
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("update 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("update 에러 "+e.getMessage());
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
	public void delete() {
		Scanner sc = new Scanner(System.in);
		int no;
		String sql;
		System.out.println("삭제할 데이터의 번호를 입력하세요");
		no=sc.nextInt();
		sql="delete from member where no="+no;
		System.out.println(sql);
		Connection conn=null;
		Statement stmt =null;
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("delete 완료");
		} catch (SQLException e) {
			System.out.println("delete 에러 "+e.getMessage());
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
	public void select() {
		System.out.println("시퀀스\t이름\t나이\t주소\t현재날짜");
		System.out.println("------------------------------");
		String sql;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		conn=getConnection();
		sql="select * from member";
		System.out.println(sql);
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("no") 
						+"\t"+rs.getString("name") 
						+"\t"+rs.getString("age")
						+"\t"+rs.getString("addr")
						+"\t"+rs.getDate("sdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbDriver_02 db2=new DbDriver_02();
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(true) {
			System.out.println("1.insert 2.select 3.delete 4. update 0.종료");
			n=Integer.parseInt(sc.nextLine());
			if(n==1)
				db2.insert();
			else if(n==0)
			{
				System.out.println("종료");
				break;
			}
			else if(n==2) {
				db2.select();
			}
			else if(n==3) {
				db2.delete();
			}
			else if(n==4) {
				db2.update();
			}
			else {
				System.out.println("값을 입력하세요");
			}
		}
		
	}

}
