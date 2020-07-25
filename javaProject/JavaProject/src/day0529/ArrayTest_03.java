package day0529;

public class ArrayTest_03 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 12, 2, 3}; //�迭�����ϸ鼭 �ʱⰪ �ֱ�
        System.out.println("����:" + arr.length);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
        for (int b : arr) {
            System.out.println(b);
        }
    }
}
