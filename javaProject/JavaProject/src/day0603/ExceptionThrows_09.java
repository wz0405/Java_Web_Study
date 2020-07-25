package day0603;

import java.util.Scanner;

public class ExceptionThrows_09 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // ��������� ����ó��
        // ���ܰ� �߻��� ��찡 �ƴԿ��� �ұ��ϰ� ���ǿ� �ش��ϸ� ������ ����ó��
        // throws- ȣ���� �������� ����ó���� ����
        // throw- ������ ���ܸ� �߻���ų��
        try {
            scoreInput();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("�����޼���: " + e.getMessage());
        }
        System.out.println("��������");

    }

    public static void scoreInput() throws Exception {
        //������ 0~100���� �ƴ϶�� ������ �ͼ��� �߻��ϰ�
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("������ �Է��ϼ���");
        score = sc.nextInt();

        if (score < 0 || score > 100) {
            throw new Exception("������ �߸��ԷµǾ����ϴ�.");
        } else {
            System.out.println("���� ������" + score + "�Դϴ�");
        }
    }

}
