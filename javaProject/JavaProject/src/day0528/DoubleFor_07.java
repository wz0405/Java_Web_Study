package day0528;

public class DoubleFor_07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) break;
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
    //��ø for��
    //break�� ���̻��� �ݺ����� �ǳʶٰų� ����°��� �����ϴ�. (�̸�:)
}
