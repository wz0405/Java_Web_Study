package day0602;

import java.util.Scanner;

interface Command {
    public void write();
}

//////////////////////////////////
class Insert implements Command {

    @Override
    public void write() {
        // TODO Auto-generated method stub

        System.out.println("�Խ��ǿ� �Խù��� �߰��մϴ�");
    }

}

///////////////////////////
class Modify implements Command {

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("�Խ��ǿ� �Խù��� �����մϴ�");
    }

}

///////////////////
class delete implements Command {

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("�Խ��ǿ� �Խù��� �����մϴ�");
    }

}

///////////////////////
class List implements Command {

    @Override
    public void write() {
        System.out.println("�Խ��ǿ� �Խù��� ��ȸ�մϴ�");

    }

}

//////////////////////////////////////
public class InterBoardEx {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Command comm = null;
        int n;

        while (true) {

            System.out.println("1.�߰�  2.����  3.���� 4.��ȸ 5�̻�.����");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    comm = new Insert();
                    break;
                case 2:
                    comm = new Modify();
                    break;
                case 3:
                    comm = new delete();
                    break;
                case 4:
                    comm = new List();
                    break;
                default:
                    System.out.println("�����մϴ�");
                    break;

            }

            if (n <= 4)
                comm.write();  //1,2,3,4���
            else
                break;
        }

    }

}
