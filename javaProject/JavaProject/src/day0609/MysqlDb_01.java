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
	String url="jdbc:mysql://localhost:3306/root";
	String user="root";
	String pass="1234";
	
	public MysqlDb_01() {
		try {
			Class.forName(driver);
			System.out.println("mysql ����̹� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����");
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("db���� ����");
			e.printStackTrace();
		}
		return conn;
	}
	public void insert()
	{
		Scanner sc=new Scanner(System.in);
		
		String name,major,grade;
		
		String sql="";
		
		System.out.println("�л�����?");
		name=sc.nextLine();
		System.out.println("�а���?");
		major=sc.nextLine();
		System.out.println("�г���?");
		grade=sc.nextLine();
		
		sql="insert into univ values(null,?,?,?,now())";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			//?,?,?���ڰ� �ϼ�
			pstmt.setString(1, name);
			pstmt.setString(2, major);
			pstmt.setString(3, grade);
			
			//������Ʈ
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
		System.out.println("������ ��ȣ�� �Է��ϼ���");
		num=sc.nextLine();
		System.out.println("������ �̸��� �Է��ϼ���");
		name=sc.nextLine();
		System.out.println("������ ������ �Է��ϼ���");
		major=sc.nextLine();
		System.out.println("������ �г��� �Է��ϼ���");
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
		System.out.println("������ ��ȣ�� �Է��ϼ���");
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
		System.out.println("������\t�̸�\t����\t�г�\t���糯¥");
		String sql="select * from univ order by num asc";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("num") //��������("�÷���")
						+"\t"+rs.getString("name") //���ڿ�("�÷���")
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
			System.out.println("1.insert 2.select 3.delete 4. update 0.����");
			n=Integer.parseInt(sc.nextLine());
			if(n==1)
				my.insert();
			else if(n==0)
			{
				System.out.println("����");
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
				System.out.println("���� �Է��ϼ���");
			}
		}
	}
}
