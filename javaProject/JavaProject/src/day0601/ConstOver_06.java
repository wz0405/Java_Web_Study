package day0601;

class Apple {
    //����Ʈ ������
    public Apple() {
        System.out.println("����Ʈ ������ ȣ�� apple");
    }
}

class Banana {
    public Banana(String str) {
        System.out.println("������ ȣ�� " + str);
    }
}

class Orange {
    public Orange() {
        System.out.println("������ ����Ʈ ������");

    }

    public Orange(String str) {
        System.out.println("������ �ι�° ������ " + str);
    }

    public Orange(int n) {
        System.out.println("������ �� ��° ������ " + n);
    }

    public Orange(String str, int n) {
        System.out.println("������ �� ��° ������ " + str + n);
    }
}

public class ConstOver_06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Apple ap = new Apple();
        Banana ba = new Banana("�ٳ���");
        Orange or = new Orange("s", 1);
    }

}
