package day0603;

class Score {
    private String name;
    private String age;
    private int java;
    private int jsp;

    static int no;

    //������4��
    public Score(String name, String age, int java, int jsp) {
        this.name = name;
        this.age = age;
        this.java = java;
        this.jsp = jsp;
    }


    public static void title() {
        System.out.println("��ȣ\t�̸�\t����\tjava\tjsp\t�հ�\t���");
        System.out.println("======================================================");
    }

    public int getTot() {
        int tot = java + jsp;
        return tot;
    }

    public double getAvg() {
        double avg = getTot() / 2.0;
        return avg;
    }

    public void getScore() {
        no++;
        System.out.println(no + "\t" + name + "\t" + age + "��\t" + java + "��\t" + jsp + "��\t" + getTot() + "��\t" + getAvg() + "��");
        System.out.println("----------------------------------------------------------");

    }
}


public class ReviewConstArray_01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //�迭
        Score[] sc = new Score[5];
        sc[0] = new Score("������", "22", 88, 99);
        sc[1] = new Score("�����", "33", 100, 65);
        sc[2] = new Score("�ڼ���", "32", 77, 68);
        sc[3] = new Score("�輱��", "44", 79, 87);
        sc[4] = new Score("������", "34", 88, 66);


        Score.title();
        for (int i = 0; i < sc.length; i++) {
            sc[i].getScore();
        }

    }

}
