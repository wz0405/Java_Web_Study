import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student4 {
    String name;
    boolean isMale; // ����
    int hak;            // �г�
    int ban;            // ��
    int score;

    Student4(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHak() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d�г� %d��, %3d��]",
                name, isMale ? "��" : "��", hak, ban, score);
    }

    // groupingBy()���� ���
    enum Level {HIGH, MID, LOW}  // ������ ��, ��, �� �� �ܰ�� �з�
}

class StreamEx7 {
    public static void main(String[] args) {
        Student4[] stuArr = {
                new Student4("���ڹ�", true, 1, 1, 300),
                new Student4("������", false, 1, 1, 250),
                new Student4("���ڹ�", true, 1, 1, 200),
                new Student4("������", false, 1, 2, 150),
                new Student4("���ڹ�", true, 1, 2, 100),
                new Student4("������", false, 1, 2, 50),
                new Student4("Ȳ����", false, 1, 3, 100),
                new Student4("������", false, 1, 3, 150),
                new Student4("���ڹ�", true, 1, 3, 200),

                new Student4("���ڹ�", true, 2, 1, 300),
                new Student4("������", false, 2, 1, 250),
                new Student4("���ڹ�", true, 2, 1, 200),
                new Student4("������", false, 2, 2, 150),
                new Student4("���ڹ�", true, 2, 2, 100),
                new Student4("������", false, 2, 2, 50),
                new Student4("Ȳ����", false, 2, 3, 100),
                new Student4("������", false, 2, 3, 150),
                new Student4("���ڹ�", true, 2, 3, 200)
        };

        System.out.printf("1. �ܼ�����(������ ����)%n");
        Map<Boolean, List<Student4>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale));

        List<Student4> maleStudent = stuBySex.get(true);
        List<Student4> femaleStudent = stuBySex.get(false);

        for (Student4 s : maleStudent) System.out.println(s);
        for (Student4 s : femaleStudent) System.out.println(s);

        System.out.printf("%n2. �ܼ����� + ���(���� �л���)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale, counting()));

        System.out.println("���л� �� :" + stuNumBySex.get(true));
        System.out.println("���л� �� :" + stuNumBySex.get(false));


        System.out.printf("%n3. �ܼ����� + ���(���� 1��)%n");
        Map<Boolean, Optional<Student4>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale,
                        maxBy(comparingInt(Student4::getScore))
                ));
        System.out.println("���л� 1�� :" + topScoreBySex.get(true));
        System.out.println("���л� 1�� :" + topScoreBySex.get(false));

        Map<Boolean, Student4> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student4::isMale,
                        collectingAndThen(
                                maxBy(comparingInt(Student4::getScore)), Optional::get
                        )
                ));
        System.out.println("���л� 1�� :" + topScoreBySex2.get(true));
        System.out.println("���л� 1�� :" + topScoreBySex2.get(false));

        System.out.printf("%n4. ���ߺ���(���� ���հ���, 100�� ����)%n");

        Map<Boolean, Map<Boolean, List<Student4>>> failedStuBySex =
                Stream.of(stuArr).collect(partitioningBy(Student4::isMale,
                        partitioningBy(s -> s.getScore() <= 100))
                );
        List<Student4> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student4> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student4 s : failedMaleStu) System.out.println(s);
        for (Student4 s : failedFemaleStu) System.out.println(s);
    }
}
