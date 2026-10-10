import java.util.Locale;

public class StudentResultCardGenerator {
    static class Student {
        String name; int[] marks;
        public Student(String name, int[] marks) {
            this.name = name; this.marks = marks;
        }
        public void printResult() {
            int sum = 0;
            for (int m : marks) sum += m;
            double avg = (double) sum / marks.length;
            char grade = avg >= 75 ? 'B' : (avg >= 60 ? 'C' : (avg >= 40 ? 'D' : 'F'));
            System.out.printf(Locale.US, "%s: Average %.1f, Grade %c%n", name.toUpperCase(), avg, grade);
        }
    }
    public static void main(String[] args) {
        new Student("Asha", new int[]{80, 90, 70}).printResult();
        new Student("Ravi", new int[]{60, 55, 50}).printResult();
    }
}
