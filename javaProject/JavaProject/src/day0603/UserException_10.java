package day0603;

import java.util.Scanner;

class UserException extends Exception {
    public UserException(String msg) {
        super(msg);
    }
}

public class UserException_10 {
    public static void nameInput() throws Exception {
        Scanner sc = new Scanner(System.in);

        String str[] = {"������", "��ҿ�", "�̹�", "������", ""};
        String name = "";
        System.out.println("�̸��� �Է��ϼ���");
        name = sc.nextLine();

        for (String n : str) {
            if (n.equals(name)) {
                throw new UserException("������ �ܾ��Դϴ�");
            }
        }
        System.out.println("���� �̸��� " + name);
    }

    public static void main(String[] args) {
        try {
            nameInput();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("���� " + e.getMessage());
        }
    }
}
