package day0602;


public class InstTest {

    private InstTest() {
        System.out.println("����Ʈ������");
    }

    //������ ��ſ� �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
    public static InstTest getInstance() {
        return new InstTest();
    }

    public void writeMessage() {
        System.out.println("�ȳ��ϼ���.");
    }

}
