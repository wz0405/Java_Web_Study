package day0602;

import day0602_1.SuperObj_04;

class SubObj_04 extends SuperObj_04 {
    private String addr;

    public SubObj_04() {
        super(); //����Ʈ ������ ���鶧 super()�� �ڵ����� ���� �����Ƿ� ���ۿ��� ����Ʈ ������ ����� ��������
    }

    public SubObj_04(String name, int age, String addr) {
        super(name, age);
        this.addr = addr;
        // TODO Auto-generated constructor stub
    }

    public void writeData() {
        System.out.println("�̸� :" + name);
        System.out.println("���� :" + age);
        System.out.println("�ּ� :" + addr);
    }

}

///////////////////////////////
public class TestObj_04 {

    public static void main(String[] args) {
        SubObj_04 su = new SubObj_04("��ȿ��", 33, "����");
        su.writeData();
    }

}
