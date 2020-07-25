package day0603;

class OuterObj {
    class InnerClass {
        public void write() {
            System.out.println("����Ŭ������ �޼ҵ�");
        }
    }

    //�ܺ�Ŭ�����Ǹ޼ҵ�
    public void disp() {
        System.out.println("�ܺ�Ŭ������ �޼ҵ�");
        System.out.println("�ܺο��� ����Ŭ���� �޼ҵ� ȣ��");
        InnerClass in = new InnerClass();

        in.write();
    }
}

public class InnerClassTest_02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�ܺ�(�Ϲ���)
        OuterObj ou = new OuterObj();
        ou.disp();
        //����Ŭ������ �޼ҵ�� �ܺ���ּ��� �����ϴ�.
        OuterObj.InnerClass obj = new OuterObj().new InnerClass();
        obj.write();
    }

}
