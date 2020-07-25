package day0529;

public class ArrayMaxMin_05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�迭���� �ִ밪 �ּҰ� ���ϱ�
        int data[] = {5, 123, 13, 1, 2, -1, 6, 42};
        //ù���� ����Ÿ�� ������ �ִ밪���� ����
        int max = data[0];
        //�ι�° ����Ÿ ������ max�� ��
        for (int i = 1; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("�ִ밪��" + max);
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (min > data[i]) {
                min = data[i];
            }
        }
        System.out.println("�ּڰ���" + min);
    }

}
