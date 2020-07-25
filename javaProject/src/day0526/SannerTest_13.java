package day0526;

import java.util.Scanner;

public class SannerTest_13 {
    public static void main(String[] args) {
        //scanner�� ���ڿ��̳� ���ڸ� Ű����� �Է¹����� import�ϴ� Ŭ����
        Scanner sc = new Scanner(System.in);
        String name;
        String age;
        int num1;
        int num2;
        //��¹����� ���̵�

        System.out.print("�̸��Է�>");
        name = sc.nextLine();//������ ���ڷ� �б�
        System.out.print("�����Է�>");
        age = sc.nextLine();
        System.out.println("���� 2�� �Է�");
        //num1=sc.nextInt(); //���۰� �ɸ���� �������� ���ڿ��� ����ȯ
        num1 = Integer.parseInt(sc.nextLine());
        num2 = sc.nextInt();
        System.out.println("[�Ż�����]");
        System.out.println("�̸� :" + name);
        System.out.println("���� :" + age);
        System.out.println("�� ���� ��: " + (num1 + num2));
    }
}
