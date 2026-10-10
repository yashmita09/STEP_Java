import java.util.*;

public class FestivalBonusCalculator {
    abstract static class Employee {
        String name; double salary;
        public Employee(String n, double s) { this.name = n; this.salary = s; }
        abstract double calculateBonus();
    }
    static class FullTimeEmployee extends Employee {
        public FullTimeEmployee(String n, double s) { super(n, s); }
        double calculateBonus() { return salary * 0.10; }
    }
    static class PartTimeEmployee extends Employee {
        public PartTimeEmployee(String n, double s) { super(n, s); }
        double calculateBonus() { return salary * 0.05; }
    }
    static class InternEmployee extends Employee {
        public InternEmployee(String n, double s) { super(n, s); }
        double calculateBonus() { return 2000.0; }
    }
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
            new FullTimeEmployee("Asha", 50000),
            new PartTimeEmployee("Ravi", 30000),
            new InternEmployee("Neha", 15000)
        );
        double total = 0;
        for (Employee e : emps) {
            double b = e.calculateBonus();
            total += b;
            System.out.printf(Locale.US, "%s: %.2f%n", e.name, b);
        }
        System.out.printf(Locale.US, "Total Bonus: %.2f%n", total);
    }
}
