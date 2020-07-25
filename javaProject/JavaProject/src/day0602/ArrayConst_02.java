package day0602;

class Shop {
    private String sangpum;
    private int price;
    private String color;

    //������
    public Shop(String s, int p, String c) {
        sangpum = s;
        price = p;
        color = c;
    }

    //���� ���� ����
    public static void showTitle() {
        System.out.println("��ǰ��\t�ܰ�\t����");
        System.out.println("=====================");
    }

    //��ǰ ���
    public void getSangpum() {
        System.out.println(sangpum + "\t" + price + "\t" + color);
    }

}

public class ArrayConst_02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Shop[] sh = new Shop[5]; //5���� �����ҰŶ�� �ּҸ� �Ҵ�(�ʱⰪnull)

        //5���� shop�迭�� �����ڸ� ���ؼ� ����
        sh[0] = new Shop("���콺", 12000, "���");
        sh[1] = new Shop("û����", 55000, "�׸�");
        sh[2] = new Shop("���뽺", 18000, "ȭ��Ʈ");
        sh[3] = new Shop("����", 44000, "���");
        sh[4] = new Shop("ġ", 12000, "ȭ��Ʈ");

        //���
        Shop.showTitle();  //Ŭ������.�޼ҵ�� Ŭ�����޼ҵ� ȣ�Ⱑ��
        for (int i = 0; i < sh.length; i++) {
            sh[i].getSangpum();
        }
    }

}
