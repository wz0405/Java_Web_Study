package day0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű����κ��� ���ڿ��� �о�� ����
public class FileIOTest_04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BufferedReader br = null;
        InputStreamReader ir = null;

        ir = new InputStreamReader(System.in);
        br = new BufferedReader(ir);

        String str = "";

        System.out.println("���ڿ��� �Է��ϼ���");
        try {
            str = br.readLine();//���پ� �о�´�
            System.out.println("�Է��ѹ��ڿ� => " + str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
                ir.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
