import java.util.*;

public class CanteenBillingCounter {
    abstract static class CustomerBill {
        double amount;
        public CustomerBill(double a) { this.amount = a; }
        abstract String getType();
        abstract double calculateFinalAmount();
    }
    static class StudentBill extends CustomerBill {
        public StudentBill(double a) { super(a); }
        String getType() { return "STUDENT"; }
        double calculateFinalAmount() { return amount * 0.90; }
    }
    static class StaffBill extends CustomerBill {
        public StaffBill(double a) { super(a); }
        String getType() { return "STAFF"; }
        double calculateFinalAmount() { return amount * 0.95; }
    }
    static class GuestBill extends CustomerBill {
        public GuestBill(double a) { super(a); }
        String getType() { return "GUEST"; }
        double calculateFinalAmount() { return amount + 10.0; }
    }
    public static void main(String[] args) {
        List<CustomerBill> bills = Arrays.asList(
            new StudentBill(200),
            new StaffBill(300),
            new GuestBill(150)
        );
        double total = 0;
        for (CustomerBill b : bills) {
            double f = b.calculateFinalAmount();
            total += f;
            System.out.printf(Locale.US, "%s: %.2f%n", b.getType(), f);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
