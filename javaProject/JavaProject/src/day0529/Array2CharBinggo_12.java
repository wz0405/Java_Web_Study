package day0529;

import java.util.Scanner;

public class Array2CharBinggo_12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        //3��3���� �������� ����
        int[][] pz = new int[3][3];
        int binggo; //���������
        String ans;

        //3��3���� �迭�� 1~3������ ������ �߻���Ų��

        while (true) {
            System.out.println("***�������� ������ ����***");

            //�������ϱ�
            for (int i = 0; i < pz.length; i++) {
                for (int j = 0; j < pz[i].length; j++) {
                    //����
                    pz[i][j] = (int) (Math.random() * 3) + 1;

                }
            }

            //���
            for (int i = 0; i < pz.length; i++) {
                for (int j = 0; j < pz[i].length; j++) {
                    //���
                    System.out.printf("%4d", pz[i][j]);
                }
                System.out.println();
            }

            //������ ���ϱ�
            binggo = 0;

            //���μ���
            for (int i = 0; i < 3; i++) {
                if (pz[i][0] == pz[i][1] && pz[i][1] == pz[i][2])
                    binggo++;
            }
            //���μ� ��
            for (int i = 0; i < 3; i++) {
                if (pz[0][i] == pz[1][i] && pz[1][i] == pz[2][i])
                    binggo++;
            }
            // �밢��\��
            if (pz[0][0] == pz[1][1] && pz[1][1] == pz[2][2])
                binggo++;

            //�밢��/��
            if (pz[0][2] == pz[1][1] && pz[1][1] == pz[2][0])
                binggo++;

            System.out.println("����: " + binggo + "��");

            //break��
            System.out.println("���(c),�׸�(x)");
            ans = sc.nextLine();

            if (ans.equalsIgnoreCase("x")) {
                System.out.println("������ �����մϴ�");
                break;
            } else if (ans.equalsIgnoreCase("c")) {
                System.out.println("���....");
            } else {
                System.out.println("�߸��Է�...��������");
                break;
            }


        }

    }

}


