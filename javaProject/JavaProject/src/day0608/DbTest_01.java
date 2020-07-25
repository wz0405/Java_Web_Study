package day0608;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbTest_01 {
    //����̹�, url
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

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
            conn = DriverManager.getConnection(url, "hhh", "1234");
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
        name = sc.nextLine();
        System.out.println("�ּҸ� �Է��ϼ���");
        addr = sc.nextLine();

        sql = "insert into hello values(seq_h.nextval,'" + name + "', '" + addr + "',sysdate)";
        System.out.println(sql);

        //1.db����
        Connection conn = null;

        //2.statement
        Statement stmt = null;
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            //sql�� ���ۿ� �ʿ��� statement��ü�� createStatement ��ü�� ���� ��´�.
            //sql�� ����...insert��
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("insert ���� " + e.getMessage());
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

    /////select
    public void select() {
        System.out.println("������\t�̸�\t�ּ�\t���糯¥");
        System.out.println("------------------------------");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null; //��ȸ�Ҷ� ���̺����·� ������ִ� ��ü
        String sql = "select * from hello order by num desc";//������������ ���

        conn = getConnection();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            //select���� ��û�ϹǷ� executeQuery�޼ҵ带 �̿��ؼ� Resultset��ü�� ���� ��´�.

            //2���̻��� ���� ����� �Ҷ� while
            while (rs.next()) { //�������� ã���� true�� ��ȯ

                //rs�� next�� �̿��ؼ� ���� �����ϰ�, get�޼ҵ带 �̿��ؼ� ���̺��� �÷����� ��´�.
                System.out.println(rs.getInt("num") //��������("�÷���")
                        + "\t" + rs.getString("name") //���ڿ�("�÷���")
                        + "\t" + rs.getString("addr")
                        + "\t" + rs.getDate("sdate")); //��¥("�÷���")
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

    public void delete() {
        Scanner sc = new Scanner(System.in);
        String sql; //insert sql�ۼ��� ���� ����
        int num;
        System.out.println("�� ���� �����͸� �����Ͻðڽ��ϱ�?");
        num = sc.nextInt();

        sql = "delete from hello where num=" + num;
        System.out.println(sql);

        //1.db����
        Connection conn = null;

        //2.statement
        Statement stmt = null;
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            //sql�� ���ۿ� �ʿ��� statement��ü�� createStatement ��ü�� ���� ��´�.
            //sql�� ����...insert��
            int a = stmt.executeUpdate(sql); //������ ���ڵ� ���� ��ȯ
            if (a == 0) System.out.println("���� ������ ��ȣ�Դϴ�"); //���� ��ȣ �Է½� ���� �����ȵ� > 0 ��ȯ
            else
                System.out.println("�����Ǿ����ϴ�"); //�����Ǹ� 1�� ��ȯ
        } catch (SQLException e) {
            System.out.println("insert ���� " + e.getMessage());
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
        String sql, name, addr; //insert sql�ۼ��� ���� ����
        int num;
        System.out.println("�� ���� �����͸� �����ϰڽ��ϱ�?");
        num = sc.nextInt();
        sc.nextLine();
        System.out.println("������ �̸��� �Է��ϼ���");
        name = sc.nextLine();
        System.out.println("������ �ּҸ� �Է��ϼ���");
        addr = sc.nextLine();

        sql = "update hello set name='" + name + "',addr='" + addr + "'where num=" + num;
        System.out.println(sql);
        //1.db����
        Connection conn = null;
        //2.statement
        Statement stmt = null;

        conn = getConnection();
        try {
            stmt = conn.createStatement();
            int a = stmt.executeUpdate(sql);
            if (a == 0) System.out.println("���� ������ ��ȣ�Դϴ�"); //���� ��ȣ �Է½� ���� �����ȵ� > 0 ��ȯ
            else
                System.out.println("����Ǿ����ϴ�");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DbTest_01 db = new DbTest_01();
        //�����Լ��� ������ �߰��� �Ҽ��ְ� ���ǹ� ����
        Scanner sc = new Scanner(System.in);
        int n = 0; //1,2,3,4,���� ������ ����

        while (true) {
            System.out.println("1.insert 2.select 3.delete 4. update 0.����");
            n = Integer.parseInt(sc.nextLine());

            if (n == 1)
                db.insert();
            else if (n == 0) {
                System.out.println("����");
                break;
            } else if (n == 2) {
                db.select();
            } else if (n == 3) {
                db.delete();
            } else if (n == 4) {
                db.update();
            }
        }

    }

}
