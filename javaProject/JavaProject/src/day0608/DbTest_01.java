package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
	//connection
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn=DriverManager.getConnection(url, "hhh", "1234");
			System.out.println("db���� ����");
		} catch (SQLException e) {
			System.out.println("db���� ����");
			e.printStackTrace();
		}
		return conn;
	}
	////insert
	public void insert() {
		Scanner sc = new Scanner(System.in);
		String name, addr, sql; //insert sql�ۼ��� ���� ����
		System.out.println("�̸��� �Է��ϼ���");
		name=sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		addr=sc.nextLine();

		sql="insert into hello values(seq_h.nextval,'"+name+"', '"+addr+"',sysdate)";
		System.out.println(sql);
		
		//1.db����
		Connection conn=null;
		
		//2.statement
		Statement stmt=null;
		conn=getConnection();
		try {
			stmt=conn.createStatement();
			//sql�� ���ۿ� �ʿ��� statement��ü�� createStatement ��ü�� ���� ��´�.
			//sql�� ����...insert��
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("insert ���� "+e.getMessage());
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
		//�����Լ��� ������ �߰��� �Ҽ��ְ� ���ǹ� ����
		Scanner sc = new Scanner(System.in);
		int n=0; //1,2,3,4,���� ������ ����
		
		while(true) {
			System.out.println("1.insert 2.select 3.delete 4. update 0.����");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				db.insert();
			else if(n==0)
			{
				System.out.println("����");
				break;
			}
		}
		
	}

}
