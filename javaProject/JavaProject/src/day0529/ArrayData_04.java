package day0529;

import java.util.Scanner;

public class ArrayData_04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //���� �̸���������..�����Ҵ��� ������..�Է°��� ���
        Scanner sc = new Scanner(System.in);
        int data[] = new int[5];
        int sum = 0;
        //���Է�
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + 1 + "�� ���ڸ� �Է��ϼ���");
            data[i] = sc.nextInt();
            sum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + " =>" + data[i]);
        }
        System.out.println("��������" + sum);
    }

}
