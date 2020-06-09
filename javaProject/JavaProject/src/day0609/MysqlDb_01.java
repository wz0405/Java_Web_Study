package day0609;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MysqlDb_01 {
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String pass="new password";
	
	public MysqlDb_01() {
		try {
			Class.forName(driver);
			System.out.println("mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 실패");
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db연동 실패");
			e.printStackTrace();
		}
		return conn;
	}
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		
		String name,major,grade;
		
		String sql="";
		
		System.out.println("학생명은?");
		name=sc.nextLine();
		System.out.println("학과는?");
		major=sc.nextLine();
		System.out.println("학년은?");
		grade=sc.nextLine();
		
		sql="insert into univ values(null,?,?,?,now())";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			//?,?,?인자값 완성
			pstmt.setString(1, name);
			pstmt.setString(2, major);
			pstmt.setString(3, grade);
			
			//업데이트
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	public void update() {
		Scanner sc= new Scanner(System.in);
		String sql,num,name,major,grade;
		System.out.println("변경할 번호를 입력하세요");
		num=sc.nextLine();
		System.out.println("변경할 이름을 입력하세요");
		name=sc.nextLine();
		System.out.println("변경할 전공을 입력하세요");
		major=sc.nextLine();
		System.out.println("변경할 학년을 입력하세요");
		grade=sc.nextLine();
		
		sql="update univ set name=?, major=?,grade=? where num=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, major);
			pstmt.setString(3, grade);
			pstmt.setString(4, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String sql,num;
		System.out.println("삭제할 번호을 입력하세요");
		num=sc.nextLine();
		sql="delete from univ where num=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	public void select() {
		System.out.println("시퀀스\t이름\t전공\t학년\t현재날짜");
		String sql="select * from univ order by num asc";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("num") //숫자형태("컬럼명")
						+"\t"+rs.getString("name") //문자열("컬럼명")
						+"\t"+rs.getString("major")
						+"\t"+rs.getString("grade")
						+"\t"+rs.getDate("sdate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

	public static void main(String[] args) {
		MysqlDb_01 my = new MysqlDb_01();
		Scanner sc = new Scanner(System.in);
		int n=0;
		while(true) {
			System.out.println("1.insert 2.select 3.delete 4. update 0.종료");
			n=Integer.parseInt(sc.nextLine());
			if(n==1)
				my.insert();
			else if(n==0)
			{
				System.out.println("종료");
				break;
			}
			else if(n==2) {
				my.select();
			}
			else if(n==3) {
				my.delete();
			}
			else if(n==4) {
				my.update();
			}
			else {
				System.out.println("값을 입력하세요");
			}
		}
	}
}
