package day0529;

public class ArraySort_08 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //�������� �迭�� ������ �����ϱ�
        int arr[] = {5, 7, 9, 1, 12, 51, 52, 11};
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
