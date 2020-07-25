import java.util.ArrayList;

class NewClass2 {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}


class AnnotationEx3 {
    @SuppressWarnings("deprecation")     // deprecation���� ��� ����
    public static void main(String args[]) {
        NewClass2 nc = new NewClass2();

        nc.oldField = 10;                     //@Depreacted�� ���� ����� ���
        System.out.println(nc.getOldField()); //@Depreacted�� ���� ����� ���

        @SuppressWarnings("unchecked")               // ���׸��� ���� ��� ����
                ArrayList<NewClass2> list = new ArrayList();  // Ÿ���� �������� ����.
        list.add(nc);
    }
}

