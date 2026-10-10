import java.util.*;

public class WeeklyStaffPay {
    abstract static class Staff {
        String name;
        public Staff(String n) { this.name = n; }
        abstract double calculatePay();
    }
    static class FullTimeStaff extends Staff {
        double weeklySalary;
        public FullTimeStaff(String n, double s) { super(n); weeklySalary = s; }
        double calculatePay() { return weeklySalary; }
    }
    static class HourlyStaff extends Staff {
        double hours, rate;
        public HourlyStaff(String n, double h, double r) { super(n); hours = h; rate = r; }
        double calculatePay() {
            return hours <= 40 ? hours * rate : 40 * rate + (hours - 40) * 1.5 * rate;
        }
    }
    static class InternStaff extends Staff {
        double stipend;
        public InternStaff(String n, double s) { super(n); stipend = s; }
        double calculatePay() { return stipend; }
    }
    public static void main(String[] args) {
        List<Staff> list = Arrays.asList(
            new FullTimeStaff("Asha", 12000),
            new HourlyStaff("Ravi", 45, 200),
            new InternStaff("Neha", 5000)
        );
        double total = 0;
        for (Staff s : list) {
            double pay = s.calculatePay();
            total += pay;
            System.out.printf(Locale.US, "%s: %.2f%n", s.name, pay);
        }
        System.out.printf(Locale.US, "Total Payroll: %.2f%n", total);
    }
}
