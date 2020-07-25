package day0601;

class Person {
    String name;
    int age;

    public Person() {
        this("�۰���", 35);
    }

    public Person(String name) {
        this(name, 25);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("ȣ��");
    }

    public void write() {
        System.out.println("�̸� " + name + " ���� " + age);
    }
}

public class ConstThis_07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person pe = new Person("����", 26);
        Person pe1 = new Person("ȫ�浿");
        pe1.write();
    }

}
