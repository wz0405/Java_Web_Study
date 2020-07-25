package day0526;

public class ArgsScore_12 {
    public static void main(String[] args) {

        String name = "������ ��";
        int java = Integer.parseInt(args[0]);
        int jsp = Integer.parseInt(args[1]);
        int spring = Integer.parseInt(args[2]);
        int avg = (java + jsp + spring) / 3;
        int sum = java + jsp + spring;
        System.out.println("***�߰���� ����***");
        System.out.println("======================");
        System.out.println("�̸�: " + name);
        System.out.println("JAVA :" + java);
        System.out.println("JSP :" + jsp);
        System.out.println("SPRING :" + spring);
        System.out.println("----------------------");
        System.out.println("���� :" + sum);
        System.out.println("��� :" + avg);
    }
}
