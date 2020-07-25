package day0526;

import java.util.Calendar;
import java.util.Scanner;

public class ScanQuiz_16 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        String name;
        int year;
        String phone;
        String address;

        System.out.print("�¾ ������?");
        year = Integer.parseInt(sc.nextLine());
        //sc.nectLine ���͸� ���� �о �����ش�
        System.out.print("�̸���?");
        name = sc.nextLine();
        System.out.print("�ڵ��� ��ȣ��?");
        phone = sc.nextLine();
        System.out.print("�ּҴ�?");
        address = sc.nextLine();
        int curYear = cal.get(Calendar.YEAR);
        System.out.println("===============");
        System.out.println("�̸�:" + name);
        System.out.println("�¾ ����:" + year);
        System.out.println("���� ����: " + (curYear - year + 1));
        System.out.println("��ȭ ��ȣ:" + phone);
        System.out.println("�ּ�:" + address);


    }
}
