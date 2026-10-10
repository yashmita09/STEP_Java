import java.util.*;

public class CollegeFeeCounter {
    interface BusUser {
        double getTransportFee();
    }
    abstract static class Student {
        String name;
        public Student(String n) { this.name = n; }
        abstract double calculateTotalFee();
    }
    static class DayScholar extends Student implements BusUser {
        public DayScholar(String n) { super(n); }
        public double getTransportFee() { return 12000.0; }
        double calculateTotalFee() { return 40000.0 + getTransportFee(); }
    }
    static class Hosteller extends Student {
        public Hosteller(String n) { super(n); }
        double calculateTotalFee() { return 40000.0 + 60000.0; }
    }
    static class Scholar extends Student implements BusUser {
        public Scholar(String n) { super(n); }
        public double getTransportFee() { return 12000.0; }
        double calculateTotalFee() { return 20000.0 + getTransportFee(); }
    }
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new DayScholar("Asha"),
            new Hosteller("Ravi"),
            new Scholar("Neha")
        );
        double total = 0;
        for (Student s : students) {
            double f = s.calculateTotalFee();
            total += f;
            System.out.printf(Locale.US, "%s: %.2f%n", s.name, f);
        }
        System.out.printf(Locale.US, "Total Collected: %.2f%n", total);
    }
}
