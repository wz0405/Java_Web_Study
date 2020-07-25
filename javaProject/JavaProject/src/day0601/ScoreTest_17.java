package day0601;

class Score {
    private String name;
    private int java;
    private int spring;

    static final String TITLE = "�߰���� ����";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    //�հ�޼���
    public int getTot() {
        int num = 0;
        num = this.java + this.spring;
        return num;
    }

    //��ո޼���
    public double getAvg() {
        return getTot() / 2.0;
    }
}

public class ScoreTest_17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Score sc = new Score();
        sc.setJava(50);
        sc.setSpring(79);
        System.out.println(Score.TITLE);
        System.out.println("�հ�" + sc.getTot() + "���" + sc.getAvg());


    }

}
