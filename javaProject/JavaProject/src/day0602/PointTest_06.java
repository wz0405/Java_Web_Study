package day0602;

class Point {

    int x;
    int y;

    public Point() {
        System.out.println("����-����Ʈ ������ ȣ��");
    }

    public Point(int x, int y) {
        System.out.println("����-�����ִ� ������");
        this.x = x;
        this.y = y;
    }

    public void write() {
        System.out.println("x��ǥ " + x + " y��ǥ " + y);
    }
}

class SubPoint extends Point {
    String msg;

    public SubPoint() {
        super();
        System.out.println("����-����Ʈ������ ȣ��");
    }

    public SubPoint(int x, int y, String msg) {
        super(x, y);
        this.msg = msg;
        System.out.println("����-�����ִ� ������");
    }

    //�������̵� �޼Ҵ�
    //�θ� ���� �޼ҵ带 �籸����..�̿��� �޼ҵ� �ϼ�
    @Override
    public void write() {
        super.write();
        System.out.println("�޼���: " + msg);
    }
}

public class PointTest_06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SubPoint su = new SubPoint(1, 2, "ok");
        su.write();
        SubPoint suq = new SubPoint();
        suq.write();
    }

}
