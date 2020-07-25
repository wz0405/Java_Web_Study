package day0527;

import java.util.Scanner;

public class IfTest_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int java, jsp, spring;
        double avg;
        System.out.println("�̸��� �Է��ϼ���");
        name = sc.nextLine();
        System.out.println("�������� ������ ���ʷ� �Է��ϼ���");
        java = sc.nextInt();
        jsp = sc.nextInt();
        spring = sc.nextInt();

        //���
        avg = (java + jsp + spring) / 3.0;
        System.out.println("3������ ����:" + java + "," + jsp + "," + spring);
        System.out.println("���:" + avg);
        System.out.println("�հ������� ��� 60�� �̻��̰� �� ���� ��� 40�� �̻��Դϴ�");

        if (avg >= 60 && java >= 40 && jsp >= 40 && spring >= 40) {
            System.out.println(name + "���� �հ��Դϴ�");
        } else {
            System.out.println(name + "���� ���հ��Դϴ�");
        }
    }
}
