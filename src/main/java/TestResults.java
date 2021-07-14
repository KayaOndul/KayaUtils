import java.util.stream.*;
import java.util.*;
import java.util.stream.Collectors;

public class TestResults
{
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        return students.filter(e->{
            return e.getScore()>=passingScore;
        })
                .sorted((o1,o2)->(((Integer)o2.getScore()).compareTo((Integer) o1.getScore())))
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}