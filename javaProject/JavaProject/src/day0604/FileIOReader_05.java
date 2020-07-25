package day0604;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOReader_05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String filePath = "C:\\java_0526\\javaProject\\ch01\\src\\Hello.java";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(filePath);
            System.out.println("������ ã��");

            br = new BufferedReader(fr);
            while (true) {
                //���Ͽ��� ���پ� �д´�
                String line = br.readLine();

                //������ �����ΰ��� null�� ��ȯ
                if (line == null)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("������ ã�� �� ����" + e.getMessage());
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
