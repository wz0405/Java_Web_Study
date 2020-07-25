package day0528;

import java.util.Scanner;

public class ScanWhileTrue_05 {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        // TODO Auto-generated method stub
        System.out.println("�հ踦 ���� ���ڸ� �Է��Ͻÿ�");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int s = num;
        System.out.println("---------------------");
        while (true) {
            sum += num;
            num--;
            if (num == 0) break;
        }
        System.out.println("1~" + s + "������ ����" + sum + "�Դϴ�");

    }

}
