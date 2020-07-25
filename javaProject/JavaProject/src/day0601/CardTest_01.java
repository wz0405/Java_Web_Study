package day0601;

class Card {
    //�ν��Ͻ� ����
    //�� �ν��Ͻ��� �������� ���߰ﰣ ���� �ٸ��� ���尡��
    //����������. ���� ���ٰ���
    String kind; //ī�� ����
    int number; //ī���� ����


    //Ŭ���� ����..static����
    //����ν��Ͻ����� ����..Ŭ������ �ε��ɶ� ���� ����ɶ� �Ҹ�
    //Ŭ������.���������� ���ٰ���
    static int width, height;
}

public class CardTest_01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Card cd = new Card();
        cd.kind = "50";
        cd.number = 20;

        Card.width = 50;
        Card.height = 80;
        System.out.println(Card.width);
        System.out.println(Card.height);
        System.out.println(cd.kind);
        System.out.println(cd.number);
        Card cd2 = new Card();
        cd2.kind = "space";
        cd2.number = 7;
        System.out.println(cd2.kind + cd2.number);
    }

}
