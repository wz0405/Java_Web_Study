package day0526;

import java.util.Scanner;

public class ScannerScore_14 {
    public static void main(String[] args) {
        String name;
        String ko;
        String ma;
        String en;
        Scanner sc = new Scanner(System.in);
        System.out.print("����� �̸���?");
        name = sc.nextLine();
        System.out.print("����������?");
        ko = sc.nextLine();
        System.out.print("����������?");
        ma = sc.nextLine();
        System.out.print("����������?");
        en = sc.nextLine();

        System.out.println("===============");
        System.out.println("�̸�: " + name);
        System.out.println("��������: " + ko);
        System.out.println("��������: " + ma);
        System.out.println("��������: " + en);

        System.out.println("---------------");
        int num1 = Integer.parseInt(ko);
        int num2 = Integer.parseInt(ma);
        int num3 = Integer.parseInt(en);
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("���: " + avg);

    }
}
