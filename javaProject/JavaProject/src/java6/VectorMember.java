package java6;

import java.util.*;


public class VectorMember {
    Vector<Member> list = new Vector<Member>();

    public void setData() {
        Scanner sc = new Scanner(System.in);
        String name;
        String phone;
        int num;
        System.out.println("����?");
        name = sc.nextLine();
        System.out.println("��ȭ��ȣ?");
        phone = sc.nextLine();
        System.out.println("���űݾ�?");
        num = sc.nextInt();

        Member me = new Member(name, phone, num);
        list.add(me);
    }

    public void getData() {
        int cnt = 1;
        System.out.println("[�� vip ����]");
        System.out.println("No\t�̸�\t��ȭ��ȣ\t���űݾ�\t���");
        System.out.println("---------------------------");
        for (int i = 0; i < list.size(); i++) {
            Member s = list.get(i);

            System.out.println(i + 1 + "\t" + s.getName() + "\t" + s.getNumber() + "\t" + s.getMoney() + "\t" + s.check());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        VectorMember ve = new VectorMember();
        Scanner sc = new Scanner(System.in);
        String temp;
        while (true) {
            System.out.println("��.����Է�   ��.������   ��.����");
            temp = sc.nextLine();
            if (temp.equals("��")) {
                ve.setData();
            } else if (temp.equals("��")) {
                ve.getData();
            } else if (temp.equals("��")) {
                System.out.println("����");
                break;
            }
        }
    }
}
