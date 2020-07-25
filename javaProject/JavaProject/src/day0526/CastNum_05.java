package day0526;

public class CastNum_05 {
    public static void main(String[] args) {
		/*byte a=127;
		byte b=(byte)128;
		System.out.println(a);
		System.out.println(b); //����..������ �ڷ��������� ��ȯ..���ս�
*/
        char a = 'A';
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);
        double d = 10.5;
        //���ڳ����� ����ȯ��(�ڷ���)�� �����ش�
        int c = (int) d; //���ǵ�
        System.out.println(c);
    }
}
