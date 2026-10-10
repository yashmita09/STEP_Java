public class StudentCollegeInfoManagement {
    static class Student {
        String name; int attendance;
        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;
        public Student(String n, int a) { name = n; attendance = a; studentCount++; }
        public static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }
    public static void main(String[] args) {
        new Student("Ananya", 92);
        new Student("Vikram", 85);
        System.out.println("2 Student objects created");
        Student.printCollegeInfo();
    }
}
