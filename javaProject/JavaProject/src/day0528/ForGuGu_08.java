package day0528;

import java.util.Scanner;

public class ForGuGu_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = 0;
        // TODO Auto-generated method stub
        while (true) {
            System.out.println("���?");
            dan = sc.nextInt();
            if (dan >= 2 && dan <= 9) {
                System.out.println(dan + "��");
                for (int i = 1; i <= 9; i++) {
                    System.out.println(dan + "x" + i + "=" + dan * i);
                }
                System.out.println("");
            } else if (dan == 0) {
                System.out.println("���α׷��� �����մϴ�");
                break;
            } else {
                System.out.println("�߸��Է��߽��ϴ�.");
            }
        }
    }

}
