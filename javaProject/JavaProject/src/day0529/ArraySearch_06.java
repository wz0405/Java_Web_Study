package day0529;

import java.util.Scanner;

public class ArraySearch_06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int data[] = {5, 1, 512, 52, 34, 124, 1233, 16, 85, 32, 74};
        int num = 0;
        boolean ch = false;
        //���ڸ� �Է��ؼ� �� ���ڰ� data�ȿ� �ִ���
        //������ ���ٰ� ǥ��, ������ ���° �ִ���
        //0�Է½� ����
        while (true) {
            System.out.println("�˻��� ���ڸ� �Է��ϼ���");
            num = sc.nextInt();
            for (int i = 0; i < data.length; i++) {
                if (data[i] == num) {
                    ch = true;
                    System.out.println("���� ã�ҽ��ϴ�. ����" + i + "��°�� �ֽ��ϴ�");
                }
            }
            if (num == 0) {
                System.out.println("Ž���� �����մϴ�.");
                break;
            }
            if (!ch)
                System.out.println("�����Ϳ� ����");

        }

    }
}
		
