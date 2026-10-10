import java.util.*;

public class MovieTicketCounter {
    abstract static class Ticket {
        static final double CONVENIENCE_FEE = 20.0;
        int count;
        public Ticket(int c) { this.count = c; }
        abstract String getSeatType();
        abstract double getBasePrice();
        public double calculateAmount() {
            return count * (getBasePrice() + CONVENIENCE_FEE);
        }
    }
    static class RegularTicket extends Ticket {
        public RegularTicket(int c) { super(c); }
        String getSeatType() { return "REGULAR"; }
        double getBasePrice() { return 150.0; }
    }
    static class PremiumTicket extends Ticket {
        public PremiumTicket(int c) { super(c); }
        String getSeatType() { return "PREMIUM"; }
        double getBasePrice() { return 250.0; }
    }
    static class ReclinerTicket extends Ticket {
        public ReclinerTicket(int c) { super(c); }
        String getSeatType() { return "RECLINER"; }
        double getBasePrice() { return 400.0; }
    }
    public static void main(String[] args) {
        List<Ticket> bookings = Arrays.asList(
            new RegularTicket(3),
            new PremiumTicket(2),
            new ReclinerTicket(1)
        );
        double total = 0;
        for (Ticket t : bookings) {
            double amt = t.calculateAmount();
            total += amt;
            System.out.printf(Locale.US, "%s: %.2f%n", t.getSeatType(), amt);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
