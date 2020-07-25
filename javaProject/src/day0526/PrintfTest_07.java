package day0526;

public class PrintfTest_07 {
    public static void main(String[] args) {
        //printf: %d-���� %s-����
        //����
        int num1 = 50, num2 = 30;
        int result = num1 + num2;
        System.out.printf("����1�� %d�̰�, ���� 2�� %d�Դϴ� �� ���� %d�Դϴ�.\n", num1, num2, result);
        System.out.println("***println���� ���***");
        System.out.println("����1�� " + num1 + "�̰�, ���� 2��" + num2 + "�Դϴ� �� ����" + result + "�Դϴ�");
    }
}
