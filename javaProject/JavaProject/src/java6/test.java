package java6;

class A {
    public void test(B b) {
        b.test1();
    }
}

class B {
    public void test1() {
        System.out.println("hi");
    }
}

public class test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.test(b);
    }
}
