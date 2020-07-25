package day0527;

import java.util.Scanner;

public class QuizIfScan_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ �Է��ϼ���");
        int score = sc.nextInt();
        String grade;
        System.out.println("����" + score);
        if (score >= 90) {
            System.out.println("�򰡸޼���:�� ���߾��");
            grade = "A";
        } else if (score >= 80) {
            System.out.println("�򰡸޼���:�� �� ����ϼ���");
            grade = "B";
        } else {
            System.out.println("�򰡸޼���:������ȸ��..");
            grade = "C";
        }
        System.out.println("����:" + grade);


    }


}
