package day0602;

interface InterAA {
    public void draw();

    public void play();
}

interface InterBB extends InterAA {
    public void write();
}

class InterImpl implements InterBB {
    int num = 0;

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("draw");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play");
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub
        System.out.println("write");
    }

}

public class InterEx2_08 extends InterImpl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InterBB in = new InterImpl();
        in.draw();
        in.play();
        in.write();
        InterBB[] in1 = new InterImpl[1];
        in1[0] = new InterImpl();
        System.out.println(in1[0]);
    }

}
