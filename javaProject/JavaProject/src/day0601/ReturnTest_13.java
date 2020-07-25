package day0601;

import java.util.Scanner;

public class ReturnTest_13 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String y =sc.nextLine();
    	System.out.println(y);
        divide(4, 5);
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("0���δ� ������ �����ϴ�.");
            return;
        } else
            System.out.println("�������� ���: " + num1 / num2);
    }

}