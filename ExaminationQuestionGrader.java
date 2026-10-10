import java.util.*;

public class ExaminationQuestionGrader {
    abstract static class Question {
        String text, correct, student;
        int points;
        public Question(String t, String c, String s, int p) {
            text = t; correct = c; student = s; points = p;
        }
        abstract String getType();
        abstract double grade();
    }
    static class McqQuestion extends Question {
        public McqQuestion(String t, String c, String s, int p) { super(t, c, s, p); }
        String getType() { return "MCQ"; }
        double grade() { return correct.equalsIgnoreCase(student) ? points : 0.0; }
    }
    static class TfQuestion extends Question {
        public TfQuestion(String t, String c, String s, int p) { super(t, c, s, p); }
        String getType() { return "TF"; }
        double grade() { return correct.equalsIgnoreCase(student) ? points : 0.0; }
    }
    static class EssayQuestion extends Question {
        public EssayQuestion(String t, String c, String s, int p) { super(t, c, s, p); }
        String getType() { return "ESSAY"; }
        double grade() {
            String[] keywords = correct.split(",");
            int matched = 0;
            String studentLower = student.toLowerCase();
            for (String kw : keywords) {
                if (studentLower.contains(kw.trim().toLowerCase())) matched++;
            }
            if (matched >= 2) return points * 0.75;
            else if (matched == 1) return points * 0.50;
            return 0.0;
        }
    }
    public static void main(String[] args) {
        List<Question> qs = Arrays.asList(
            new McqQuestion("What is 2+2?", "4", "4", 10),
            new TfQuestion("Water boils at 100C?", "True", "True", 5),
            new EssayQuestion("Discuss OOP principles", "Polymorphism, Inheritance, Encapsulation", "I talked about Polymorphism and Inheritance.", 20)
        );
        double total = 0;
        for (Question q : qs) {
            double s = q.grade();
            total += s;
            System.out.printf(Locale.US, "%s: %.2f%n", q.getType(), s);
        }
        System.out.printf(Locale.US, "Total Score: %.2f%n", total);
    }
}
