import java.time.LocalDate;
import java.util.*;

public class StreamingPlanRenewalReminder {
    abstract static class Plan {
        String name; LocalDate startDate;
        public Plan(String n, LocalDate d) { this.name = n; this.startDate = d; }
        abstract LocalDate getRenewalDate();
    }
    static class BasicPlan extends Plan {
        public BasicPlan(String n, LocalDate d) { super(n, d); }
        LocalDate getRenewalDate() { return startDate.plusDays(30); }
    }
    static class StandardPlan extends Plan {
        public StandardPlan(String n, LocalDate d) { super(n, d); }
        LocalDate getRenewalDate() { return startDate.plusDays(90); }
    }
    static class PremiumPlan extends Plan {
        public PremiumPlan(String n, LocalDate d) { super(n, d); }
        LocalDate getRenewalDate() { return startDate.plusDays(365); }
    }
    public static void main(String[] args) {
        List<Plan> subs = Arrays.asList(
            new BasicPlan("Asha", LocalDate.parse("2024-01-15")),
            new StandardPlan("Ravi", LocalDate.parse("2024-02-01")),
            new PremiumPlan("Neha", LocalDate.parse("2024-03-10")),
            new BasicPlan("Kiran", LocalDate.parse("2024-12-20"))
        );
        for (Plan p : subs) {
            System.out.println(p.name + ": " + p.getRenewalDate());
        }
    }
}
