package day0603;

public class ExceptionTest_06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("���α׷�����");
        try {
            //���ܰ� �߻��� �� �ִ� �ڵ�
            int num = 3 / 0; //������ 0���� �������� �� �����߻�
        } catch (Exception e) {
            //�ذ���
            //�ڼ��� �����޼���
            e.printStackTrace();
        }
        System.out.println("���α׷�����");

    }

}
