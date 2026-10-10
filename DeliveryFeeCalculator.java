import java.util.*;

public class DeliveryFeeCalculator {
    abstract static class DeliveryRequest {
        double weight, distance;
        public DeliveryRequest(double w, double d) { weight = w; distance = d; }
        abstract String getType();
        abstract double calculateFee();
    }
    static class StandardDelivery extends DeliveryRequest {
        public StandardDelivery(double w, double d) { super(w, d); }
        String getType() { return "STANDARD"; }
        double calculateFee() { return 5.0 + 0.50 * weight + 0.10 * distance; }
    }
    static class ExpressDelivery extends DeliveryRequest {
        public ExpressDelivery(double w, double d) { super(w, d); }
        String getType() { return "EXPRESS"; }
        double calculateFee() { return 15.0 + 1.00 * weight + 0.20 * distance; }
    }
    static class InternationalDelivery extends DeliveryRequest {
        double customs;
        public InternationalDelivery(double w, double d, double c) { super(w, d); customs = c; }
        String getType() { return "INTERNATIONAL"; }
        double calculateFee() { return 25.0 + 2.00 * weight + 0.50 * distance + customs; }
    }
    public static void main(String[] args) {
        List<DeliveryRequest> list = Arrays.asList(
            new StandardDelivery(10, 50),
            new ExpressDelivery(5, 20),
            new InternationalDelivery(20, 100, 30)
        );
        double total = 0;
        for (DeliveryRequest r : list) {
            double f = r.calculateFee();
            total += f;
            System.out.printf(Locale.US, "%s: %.2f%n", r.getType(), f);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
