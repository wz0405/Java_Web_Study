package day0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerCalAge_15 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        String name;
        String year;
        System.out.print("�̸��Է�:");
        name = sc.nextLine();
        System.out.print("�¾ ���� �Է�:");
        year = sc.nextLine();
        System.out.println("===============");
        System.out.println("�Ż�����");
        System.out.println("�̸�:" + name);
        int inyear = Integer.parseInt(year);
        int curYear = cal.get(Calendar.YEAR);
        System.out.println("���� ����: " + (curYear - inyear + 1));

    }
}
