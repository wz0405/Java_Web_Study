package day0604;

import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_03 {


    Vector<BoardDTO_3> list = new Vector<BoardDTO_3>();

    //1. �Է��� �������� ��쿡 �ش��ϴ� �޼ҵ�
    public void setBoard() {
        Scanner sc = new Scanner(System.in);
        String name, subject, content;
        System.out.println("�ۼ��ڴ�?");
        name = sc.nextLine();
        System.out.println("������?");
        subject = sc.nextLine();
        System.out.println("������?");
        content = sc.nextLine();

        BoardDTO_3 data = new BoardDTO_3(name, subject, content);
        //���Ϳ� ��´�
        list.add(data);
        System.out.println("���� ����Ÿ����: " + list.size() + "��");
    }

    //2. ����� �������� ��쿡 �ش��ϴ� �޼ҵ�
    public void getBoard() {
        System.out.println("***�Խ���***");
        System.out.println("----------------------");
        for (int i = 0; i < list.size(); i++) {
            //����Ʈ���� ������ ��ġ�� �ִ� ��Ұ��� �����ش�
            BoardDTO_3 b = list.get(i);
            System.out.println("No. " + (i + 1) + "�ۼ���: " + b.getName());
            System.out.println("����: " + b.getSubject());
            System.out.println("����: " + b.getContent());
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        VectorBoard_03 ve = new VectorBoard_03();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1���� ��� 2���� �Է� 0���� �����Դϴ�.");
            n = sc.nextInt();
            if (n == 2) {
                ve.setBoard();
            } else if (n == 1) {
                ve.getBoard();
            } else if (n == 0) {
                System.out.println("���α׷� ����");
                break;
            }
        }
    }

}
