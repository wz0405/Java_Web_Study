package day0603;

class Outer {
    int a = 10;
    static int b = 20;

    class Inner {
        int c = 30;

        //static int d=100; ���ο����� static ����
        //��¸޼ҵ�_����
        public void write() {
            System.out.println("�ܺκ��� a=" + a);
            System.out.println("�ܺ� �������� b=" + b);
            System.out.println("���� ����c=" + c);
            System.out.println("���� ���������� �Ұ���");
        }
    }
}

public class InnerClassVar_04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Outer.Inner ou = new Outer().new Inner();
        ou.write();
    }

}
