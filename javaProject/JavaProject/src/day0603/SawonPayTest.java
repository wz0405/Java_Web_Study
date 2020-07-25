package day0603;

import java.util.Scanner;

public class SawonPayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int pay, gasu, timesu;

        System.out.println("�������?");
        name = sc.nextLine();
        System.out.println("�⺻����?");
        pay = sc.nextInt();
        System.out.println("�ʰ��ð���?");
        timesu = sc.nextInt();
        System.out.println("�� ��������?");
        gasu = sc.nextInt();

        Sawon sa = new Sawon(name, pay, timesu, gasu);
        System.out.println("�����\t�⺻��\t�ð�����\t������\t�ѱ޿�");
        sa.getSawon();

    }
}
