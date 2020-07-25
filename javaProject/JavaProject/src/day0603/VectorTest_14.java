package day0603;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest_14 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //�迭�� �޸� �ڵ����� �迭���̰� �þ��

        //List<String>list=new Vector<String>();
        Vector<String> list = new Vector<String>();

        System.out.println("�ʱ��Ҵ�ũ��: " + list.capacity());
        System.out.println("�ʱⵥ���� ����: " + list.size());

        //�߰�
        list.add("���");
        list.add("���");
        list.add("������");
        list.add("���");
        list.add("Ű��");

        System.out.println("����: " + list.size());

        System.out.println("1.���");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("2.���");
        for (String s : list)
            System.out.println(s);

        System.out.println("3.���");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }

}
