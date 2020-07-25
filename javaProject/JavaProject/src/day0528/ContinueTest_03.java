package day0528;

import java.util.Scanner;

public class ContinueTest_03 {
    public static void continuetest1() {
        int i = 0;
        int sum = 0;

        while (true) {
            i++;
            if (i % 2 == 1)
                continue;
            sum += i;

            if (i == 100)
                break;
        }
        System.out.println(sum);
    }

    public static void continuetest2() {
        Scanner sc = new Scanner(System.in);
        int j = 0;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "��° ������ �Է��Ͻÿ�(1-100)");
            j = sc.nextInt();
            if (j <= 0 || j > 100) {
                System.out.println("�߸��� �����Դϴ�.");
                i--;
                continue;
            }
            sum += j;
        }
        System.out.println("����" + sum + "�Դϴ�.");
    }

    public static void main(String[] args) {
        continuetest2();
    }
}
