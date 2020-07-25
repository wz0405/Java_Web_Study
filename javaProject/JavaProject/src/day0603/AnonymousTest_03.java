package day0603;

abstract class AbstEx {
    abstract public void show();
}

//////////////////////
class OuterEx {
    //������ ���ÿ� ��������� Ŭ����
    AbstEx ab = new AbstEx() {

        @Override
        public void show() {
            // TODO Auto-generated method stub
            System.out.println("�͸��� Ŭ����");
        }
    };
}

/////////////////////
public class AnonymousTest_03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OuterEx ou = new OuterEx();
        //�ܺ�����������.�͸���Ŭ������ ����������.���� ȣ��
        //��������..
        ou.ab.show();
    }

}
