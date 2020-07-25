package day0526;

public class VarArgs_09 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.����...�̸�, �ּ���, ���� ���
        //String name="������";
        //String address="���۱�";
        //int age=26;
        //1.������ ��½� ����
        String name = args[0];
        String address = args[1];
        String age = args[2];
        System.out.println("[�Ż�����]");
        System.out.println("�̸� :" + name + "��");
        System.out.println("����:" + address);
        System.out.println("����:" + age + "��");

    }

}
