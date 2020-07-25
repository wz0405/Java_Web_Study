package day0529;

public class ArrayTest_01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�迭����
        //�⺻�� �迭�� ��ü�� �ν�
        //int [] arr=new int[3];
        int arr[] = new int[3];
        String arr2[] = new String[5];

        arr[0] = 10;
        arr2[2] = "20";

        System.out.println(arr2[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //for each �ܼ����..�������ٲ�,,�ܼ� ����϶� ���
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
