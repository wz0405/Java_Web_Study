import java.util.*;
import java.util.stream.*;

class StreamEx3 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("���ڹ�", 3, 300),
                new Student2("���ڹ�", 1, 200),
                new Student2("���ڹ�", 2, 100),
                new Student2("���ڹ�", 2, 150),
                new Student2("���ڹ�", 1, 200),
                new Student2("���ڹ�", 3, 290),
                new Student2("���ڹ�", 3, 180)
        };

        Stream<Student2> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student2::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr); // ��Ʈ���� �ٽ� �����Ѵ�. 
        IntStream stuScoreStream = stuStream.mapToInt(Student2::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count=" + stat.getCount());
        System.out.println("sum=" + stat.getSum());
        System.out.printf("average=%.2f%n", stat.getAverage());
        System.out.println("min=" + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}

class Student2 implements Comparable<Student2> {
    String name;
    int ban;
    int totalScore;

    Student2(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }

    public int compareTo(Student2 s) {
        return s.totalScore - this.totalScore;
    }
}
