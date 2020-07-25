package day0601;

class Member {
    String name;

    public Member(String name) {
        this.name = name;
        System.out.println("���̸��� " + this.name + "�Դϴ�");
    }
}

public class ConstTest_05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Member me = new Member("������");
        Member me2 = new Member("������");
        Member me3 = new Member("�Ѹ���");
    }

}
