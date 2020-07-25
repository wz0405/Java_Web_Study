package ch06;

public class staticTest {
    int i;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        test cd = new test();

        cd.instance();

    }

}

class test {
    int i;

    test() {
    }

    test(int i) {
        this.i = i;
    }

    static int j;

    void instance() {
        System.out.println(j);
        System.out.println(i);
    }

    static void statictest() {
        test cd = new test();
        cd.i = 5;

        System.out.println(cd.i);
        System.out.println(j);
    }

}
