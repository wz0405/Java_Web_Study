package day0603;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest_08 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //InputStream: ����Ʈ�����Է� �ֻ��� Ŭ����-�߻�Ŭ�����̹Ƿ� ��ü�� ����������Ƿ�
        //�ڽ�Ŭ������ �޾Ƽ� ��������
        //read(): �ѹ���Ʈ�� �д´�.
        //read(byte[] b)-����ڰ� ������ ����Ʈ�� �̿��ؼ� �Ѳ����� ���ϴ� ��ŭ �д´�.

        InputStream is = System.in;
        int a = 0;
        System.out.println("�ѱ��� �Է�: ");

        try {
            a = is.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("����: " + e.getMessage());
        }
        System.out.println("3�ʵڿ� ����մϴ�");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("�Է°� :" + (char) a);
    }

}
