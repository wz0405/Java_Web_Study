package day0604;

import java.util.Scanner;
import java.util.Vector;

public class VectorScore {

    //���̺������� ���� ������ �ִ� �ٷ���
    //�ٷ��̿� Ŭ������ ��Ҵ�....�׷� �������� Ŭ����
    Vector<ScoreDTO> list = new Vector<ScoreDTO>();

    //1.�����Է��� �������� ���� �̸�,����2���� �Է��� �޼ҵ�
    public void setScore() {
        Scanner sc = new Scanner(System.in);

        String name;
        int java, spring;

        System.out.println("�л��̸���?");
        name = sc.nextLine();
        System.out.println("�ڹ�������?");
        java = sc.nextInt();
        System.out.println("������������?");
        spring = sc.nextInt();

        //DTOŬ������ ����
        ScoreDTO dto = new ScoreDTO(name, java, spring);
        list.add(dto); //���Ͳٷ��̿� ScoreDTO �� ��ڴ�
    }


    //2.���輺�����
    public void getScore() {
        System.out.println("[���輺�� ���]");
        ScoreDTO.title();  //static�޼ҵ�� �������....��¹����� ���־ �������
        System.out.println("===========");

        for (int i = 0; i < list.size(); i++) {
            ScoreDTO s = list.get(i);

            System.out.println(i + 1 + "\t" + s.getName() + "\t" + s.getJava() + "\t" + s.getSpring() + "\t" + s.getAvg() + "\t" + s.getPeonga());
            System.out.println("-----------");
        }
    }


    public static void main(String[] args) {

        //����..1.�����Է� 2.������� �޼ҵ带 ������� VectorScore �̹Ƿ� �����ؾߵȴ�
        VectorScore vs = new VectorScore();

        Scanner sc = new Scanner(System.in);

        int n = 0; //1,2,9 �� ������ ������ ����

        while (true) {

            System.out.println("1.���輺���Է�   2.���輺�����   9.����");
            n = sc.nextInt();

            if (n == 1)
                vs.setScore();
            else if (n == 2)
                vs.getScore();
            else if (n == 9) {
                System.out.println("�����մϴ�");
                break;
            }
        }


    }

}
