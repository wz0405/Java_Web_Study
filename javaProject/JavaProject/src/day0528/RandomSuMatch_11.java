package day0528;

import java.util.Scanner;

public class RandomSuMatch_11 {
    public static void main(String[] args) {
        int j = (int) (Math.random() * 20) + 1;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("���ڸ� �Է��ϼ���");
            num = sc.nextInt();
            if (j < num) {
                System.out.println(num + "���� �۽��ϴ�.");
            } else if (j > num) {
                System.out.println(num + "���� Ů�ϴ�.");

            } else {
                System.out.println("�¾ҽ��ϴ� ������" + j + "�Դϴ�");
                break;
            }
        }
    }
}
