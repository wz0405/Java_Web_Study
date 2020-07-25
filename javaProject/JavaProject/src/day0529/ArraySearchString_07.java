package day0529;

import java.util.Scanner;

public class ArraySearchString_07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String data[] = {"��", "��", "��", "��", "��", "��", "��", "��", "��"};
        String num = "";
        boolean ch = false;
        //���ڸ� �Է��ؼ� �� ���ڰ� data�ȿ� �ִ���
        //������ ���ٰ� ǥ��, ������ ���° �ִ���
        //0�Է½� ����
        while (true) {
            System.out.println("�˻��� ���ڿ��� �Է��ϼ���");
            num = sc.nextLine();
            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(num)) {
                    ch = true;
                    System.out.println("���� ã�ҽ��ϴ�. ����" + i + "��°�� �ֽ��ϴ�");
                }
            }
            if (num.equals("Q") || num.equals("q")) {
                System.out.println("Ž���� �����մϴ�.");
                break;
            }
            if (!ch)
                System.out.println("�����Ϳ� ����");

        }

    }
}
		
