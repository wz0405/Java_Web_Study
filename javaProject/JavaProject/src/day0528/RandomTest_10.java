package day0528;

public class RandomTest_10 {
    public static void main(String[] args) {
        //Math.random() �Ѽ��� 0 �̻� 1 �̸��� ������ �Ǽ����� ��ȯ

        //10���� ���� �߻�
        for (int i = 0; i < 10; i++) {
            double j = Math.random();
            System.out.println(j);
        }
    }
}
//int n=(int)(Math.random()*m)+n;
//n~(m+n-1)
