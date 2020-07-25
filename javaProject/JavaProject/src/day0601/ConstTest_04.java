package day0601;

class Number {
    int num = 0;

    //������
    public Number() {
        // TODO Auto-generated constructor stub
        System.out.println("����Ʈ ������ ȣ��");
    }

    public Number(int num) {
        this.num = num; //�̸��� ������� this.num �ν��Ͻ� ������ ����
        System.out.println("������ ȣ��");
    }

    public int getNumber() {
        num = 100;
        return num;
    }
}

public class ConstTest_04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //���θ޼��忡���� �ν��Ͻ��� �����ɶ����� ������ �ڵ�ȣ��
        Number cd = new Number(1);
        Number cd1 = new Number();
        System.out.println(cd1.num);
        System.out.println(cd.num);

        //����Ʈ ������ �����ؼ� �޼��� ��������
        System.out.println(cd.getNumber());

    }


}
