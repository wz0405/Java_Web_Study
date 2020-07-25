package day0527;

import java.util.Scanner;

public class IfTest_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int n = 5;
         *
         *
         * if(n>=5) { System.out.println("n�� 5���� Ů�ϴ�."); } else {
         * System.out.println("n�� 5���� �۽��ϴ�."); }
         */
        //Q. Ȧ���� Ȧ�� ¦���� ¦��
        System.out.print("���ڸ� �Է��ϼ���: ");
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(n + "�� Ȧ���Դϴ�");
        } else {
            System.out.println(n + "�� ¦���Դϴ�");
        }
    }
}
