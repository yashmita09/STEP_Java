public class StudentGradeAssignment {
    public static String getGrade(int marks) {
        if (marks >= 90) return "Grade A";
        if (marks >= 75) return "Grade B";
        if (marks >= 60) return "Grade C";
        if (marks >= 40) return "Grade D";
        return "Grade F";
    }
    public static void main(String[] args) {
        System.out.println(getGrade(72));
        System.out.println(getGrade(95));
        System.out.println(getGrade(35));
    }
}
