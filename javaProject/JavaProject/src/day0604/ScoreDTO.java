package day0604;

public class ScoreDTO {

    private String name;
    private int java;
    private int spring;

    //����Ʈ������-�⺻���� �����!!!
    public ScoreDTO() {
        // TODO Auto-generated constructor stub
    }

    //������_�ݵ�� �ν��Ͻ�����=���ڰ�(�Ķ��Ÿ��)
    public ScoreDTO(String name, int java, int spring) {
        this.name = name;
        this.java = java;
        this.spring = spring;
    }

    //������ setter,getter
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


    //Ÿ��Ʋ...ststic�޼ҵ�� Ŭ������.�޼ҵ������ ���ٰ����ϴ�...
    public static void title() {
        System.out.println("No\t�л���\t�ڹ�\t������\t���\t��");
    }

    //��ձ��ϴ� �޼ҵ�
    public double getAvg() {
        double avg = (java + spring) / 2.0;
        return avg;  //return���� �޼ҵ常�鶧�� �ڷ����� ��ġ�ؾ��Ѵ�
    }

    //�򰡸޼ҵ�
    public String getPeonga() {
        if (getAvg() >= 90)
            return "�����߾��";
        else if (getAvg() >= 80)
            return "�� ����Ұ�!!";
        else
            return "�����";
    }


}


