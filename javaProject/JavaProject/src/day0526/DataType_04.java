package day0526;

public class DataType_04 {
    public static void main(String[] args) {
        //8���� �ڷ���
        boolean flag = false;
        char ch = 'A'; //�⺻������ ������..�ƽ�Ű�ڵ�� ���氡��..�ҵ���ǥ�� ǥ��
        char ch2 = 'a';
        byte num = -128;
        int num2 = 500000; //32bit
        long num3 = 8232332; //64bit
        double num4 = 42.23; //64bit
        float num5 = 1.123f; //�ڿ� f 32bit
        System.out.println(flag);
        System.out.println(ch);
        System.out.println(ch + ch2);
        System.out.println(ch + 2);
        //char�� ĳ����..�ٲٷ��� �ڷ����̸�(char)
        System.out.println((char) (ch + 2));
        System.out.println(num + num2 + num3 + num4 + num5);
    }
}
