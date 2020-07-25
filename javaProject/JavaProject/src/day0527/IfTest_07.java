package day0527;

import java.util.Scanner;

public class IfTest_07 {
    public static void main(String[] args) {

        //����?��:����
        Scanner sc = new Scanner(System.in);

        int x, y, max;
        System.out.println("**�ΰ��� ���ڸ� �Է����ּ���**");
        x = sc.nextInt();
        y = sc.nextInt();

        /*
         * if(x>=y) { max=x; } else { max=y; }
         */
        //���׿�����
        max = x >= y ? x : y;
        System.out.println("�� ���� �� ū ����" + max);
    }
}
