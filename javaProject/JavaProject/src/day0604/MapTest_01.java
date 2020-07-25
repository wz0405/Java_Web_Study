package day0604;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {
    //key�� value���� ã�´�
    //������ ������������
    //Ű�� �ߺ���������ʰ� ���� �ߺ������
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, String> map = new HashMap<String, String>();
        map.put("�ѹ���", "����Ż��");
        map.put("name", "��ȣ��");
        System.out.println(map.get("�ѹ���"));
        System.out.println(map.get("blood")); //�ʿ� ���� Ű������ ���ϸ� �ΰ�
        //Ű���� ���� �Ѳ����� ������ ���� ��� ���
        Set<String> keyset = map.keySet();
        System.out.println("1.���");
        Iterator<String> keyiter = keyset.iterator();
        while (keyiter.hasNext()) {
            String key = keyiter.next();
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("2.���");
        for (String key : keyset) {
            System.out.println(key + " " + map.get(key));
        }
    }

}
