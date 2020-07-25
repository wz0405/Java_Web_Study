package day0526;

import java.util.Calendar;

public class CalAge_11 {
    public static void main(String[] args) {
        String name = "������";
        //���� �⵵�� �ʿ�...Calendar import
        //���
        //���
        int myYear = 1995;
        Calendar cal = Calendar.getInstance();
        int curYear = cal.get(Calendar.YEAR);
        System.out.println("�̸�: " + name + " ��");
        System.out.println("����: " + (curYear - myYear + 1));
    }
}
