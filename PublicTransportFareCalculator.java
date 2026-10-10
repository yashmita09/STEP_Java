import java.util.*;

public class PublicTransportFareCalculator {
    abstract static class Journey {
        double distance;
        public Journey(double d) { distance = d; }
        abstract String getType();
        abstract double calculateFare();
    }
    static class BusJourney extends Journey {
        public BusJourney(double d) { super(d); }
        String getType() { return "BUS"; }
        double calculateFare() { return Math.min(10.0, 2.0 + 0.10 * distance); }
    }
    static class TrainJourney extends Journey {
        public TrainJourney(double d) { super(d); }
        String getType() { return "TRAIN"; }
        double calculateFare() { return 3.0 + 0.15 * distance; }
    }
    static class MetroJourney extends Journey {
        double factor;
        public MetroJourney(double d, double f) { super(d); factor = f; }
        String getType() { return "METRO"; }
        double calculateFare() { return (1.50 + 0.20 * distance) * factor; }
    }
    public static void main(String[] args) {
        List<Journey> journeys = Arrays.asList(
            new BusJourney(15),
            new TrainJourney(50),
            new MetroJourney(10, 1.5)
        );
        double total = 0;
        for (Journey j : journeys) {
            double f = j.calculateFare();
            total += f;
            System.out.printf(Locale.US, "%s: %.2f%n", j.getType(), f);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
