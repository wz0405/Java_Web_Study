package day0602;

class Info {
    private String name;
    private String blood;
    private int age;

    Info() {
    }

    Info(String name, String blood, int age) {
        this.name = name;
        this.blood = blood;
        this.age = age;
    }

    void getData() {
        System.out.println(this.name + "\t" + this.blood + "\t" + this.age);
    }
}

public class QuizArray_10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Info[] in = new Info[4];
        in[0] = new Info("�̼���", "B��", 17);
        in[1] = new Info("�̼���", "B��", 17);
        in[2] = new Info("�̼���", "B��", 17);
        in[3] = new Info("�̼���", "B��", 17);

        for (int i = 0; i < 4; i++) {
            in[i].getData();
        }
    }

}
