package day0601;

public class Sangpum_16 {
    private String sangpum; //��ǰ��
    private int su; //����
    private int dan; //�ܰ�

    public void setData(String sangpum, int su, int dan) {
        this.sangpum = sangpum;
        this.su = su;
        this.dan = dan;
    }

    public void getData() {
        System.out.println("[��ǰ����]");
        System.out.println("��ǰ��: " + this.sangpum);
        System.out.println("����: " + this.su + "��");
        System.out.println("�ܰ�: " + this.dan + "��");
        System.out.println("=========================");
    }
}
