package day0602;

class Food {
    private String menu;
    private int price;

    static int menuno = 1;

    //������ 2��¥�� ������ get�޼��� Ȱ���� ��¹�
    public Food(String menu, int price) {
        this.menu = menu;
        this.price = price;
    }

    public void getData() {
        System.out.println("�޴�_" + menuno);
        menuno++;
        System.out.println("�޴���: " + this.menu);
        System.out.println("����: " + this.price);
        System.out.println("------------------");

    }
    //����Ʈ �������� ��� set�޼��常��� get�޼��� �����
}

public class FoodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Food fo = new Food("���İ�Ƽ", 18000);
        fo.getData();
        Food fo1 = new Food("�Ľ�Ÿ", 15000);
        fo1.getData();
    }

}
