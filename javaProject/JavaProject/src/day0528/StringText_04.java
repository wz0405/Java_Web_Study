package day0528;

import java.util.Scanner;

public class StringText_04 {
    public static void test1() {
        Scanner sc = new Scanner(System.in);
        String name;
        int cnt = 0;

        while (true) {
            System.out.println("�̸��Է�(����=��)");
            name = sc.nextLine();

            if (name.contentEquals("��"))
                break;
            if (name.startsWith("��"))
                cnt++;
        }
        System.out.println("�达���� ��������� ��" + cnt + "�Դϴ�");
    }

    public static void test2() {
        //charAt(index) : �ѱ��ڸ� ����
        String a = "950327-1010101";
        char check = a.charAt(7);
        if (check == '1') {
            System.out.println("����");
        } else {
            System.out.println("����");
        }


    }

    public static void test3() {
        //substring���� ���ڿ� ����
        String str = "���� fn�̳뿡�࿡�� ���ż����� ���� ���Դϴ�.";

        String word1 = str.substring(12, 16);
        System.out.println(word1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //test1();
        //test2();
        test3();
    }

}
