package day0526;


import java.util.Calendar;

public class CalTest_10 {
    public static void main(String[] args) {
        //Date date=new Date(); //�������� ����
        //import....Ŭ������.getInstance()
        //����������.�޼���� �ʿ��� �޼��� Ȱ��
        Calendar cal = Calendar.getInstance();

        System.out.println("������" + cal.get(cal.YEAR) + "�⵵ �Դϴ�");
        System.out.println("������" + (cal.get(cal.MONTH) + 1) + "�� �Դϴ�");
        System.out.println("�������ڴ�" + cal.get(cal.DAY_OF_MONTH) + "�� �Դϴ�");
        System.out.println("�ð�: " + cal.get(cal.HOUR_OF_DAY) + "��" + cal.get(cal.MINUTE) + "��" + cal.get(cal.SECOND) + "��");
    }
}
