package day0528;

public class QuizForWhile_11 {
    public static void while_3() {
        int num = 100;
        int cnt = 0;
        int sum = 0;
        while (true) {
            if (num % 2 == 0) {
                cnt++;
                sum += num;
            }
            num--;
            if (num == 0) break;
        }
        System.out.println(sum);
    }

    public static void for_2() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //while_3();
        for_2();
    }
}
