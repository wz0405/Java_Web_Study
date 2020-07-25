package day0602_1;

import day0602.InstTest;

public class InstConst_03 {

    public static void main(String[] args) {
        //InstTest t1 = new InstTest(); //����.. �����̺��̶� ��Ű���� �带��� ������ �ȵ�
        InstTest t1 = InstTest.getInstance();
        t1.writeMessage();
    }
}
