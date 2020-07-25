package day0601;

public class obTestA_03 {
    int a;
    static int b;

    public static void main(String[] args) {
        //����Ŭ���������� Ŭ�������� ��������
        b = 20;
        System.out.println(b);

        TestA_03 ab = new TestA_03();
        System.out.println(ab.name);
        //�ν��ϼ������� �򰥸��Ƿ� Ŭ������.���� ȣ���ϴ°� �� �ٶ�����
        System.out.println(ab.message);
        System.out.println(TestA_03.message);

    }
}

