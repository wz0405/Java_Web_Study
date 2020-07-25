package day0601;

public class InfoData_15 {
    String name;
    String gender;
    String addr;

    static String ban;
    static int cnt;

    //����޼ҵ�
    public void setData(String name, String gender, String addr) {
        this.name = name;
        this.gender = gender;
        this.addr = addr;
    }

    //����� �ѹ��� �Ҽ��ִ� �޼ҵ� �����
    public void getData() {
        cnt++;
        System.out.println("**�л�" + cnt + "����**");
        System.out.println("�̸� " + this.name);
        System.out.println("�б� " + InfoData_15.ban);
        System.out.println("���� " + this.gender);
        System.out.println("�ּ� " + this.addr);
    }
}
