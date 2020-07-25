package day0527;

public class OperTest_02 {
    public static void main(String[] args) {
        //�񱳿����� : < > >= <= ==
        //�������� : &&(and),||(or)
        int a = 5, b = 3, c = 5;
        System.out.println(a > b); //t
        System.out.println(a > b && b > c); //f
    }
}
