@FunctionalInterface
interface MyFunction2 {
    void myMethod();  // public abstract void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {
        }; // MyFunction f = (MyFunction)(()->{}); 
        Object obj = (MyFunction2) (() -> {
        });  // ObjectŸ������ ����ȯ�� ������
        String str = ((Object) (MyFunction2) (() -> {
        })).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//		System.out.println(()->{});	// ����. ���ٽ��� ObjectŸ������ ����ȯ �ȵ�
        System.out.println((MyFunction2) (() -> {
        }));
//		System.out.println((MyFunction)(()-> {}).toString()); // ����
        System.out.println(((Object) (MyFunction2) (() -> {
        })).toString());
    }
}
