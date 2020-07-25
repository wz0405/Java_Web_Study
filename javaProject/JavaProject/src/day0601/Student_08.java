package day0601;

public class Student_08 {

    //�ν��Ͻ��� private�̸� ���ο��� ������ �ص� ���������� ������ �Ұ����ϴ�
    //�׷��� �ݵ�� ���ٰ����� �޼��尡 �ʼ�
    //set�� �����뵵 get�� �� ��¿뵵�� �����
    private String name;
    private int age;

    //set�޼���
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //get�޼���
    //get�� ������ ���� �����ִ� �޼���.��ȸ����
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
