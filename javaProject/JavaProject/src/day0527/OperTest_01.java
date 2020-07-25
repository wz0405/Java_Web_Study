package day0527;

public class OperTest_01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a, b;
        a = b = 5;
        //������ ��쿡�� �տ� ���̳� �ڿ� ������ �Ȱ���
        ++a;
        b++; //b=b+1
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        //���Ŀ��� ����Ҷ��� ��ġ, ��ġ ������� Ʋ����.
        int m, n;
        m = n = 0;
        a = b = 5;

        m = a++; //��ġ�ϰ�쿡�� ���� ������ ����.
        System.out.println("m=" + m + ", a=" + a);
        n = ++b; //��ġ�ϰ�쿡�� ���� ������ ����.
        System.out.println("n=" + n + ", b=" + b);
    }

}
