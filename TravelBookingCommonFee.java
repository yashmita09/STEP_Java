import java.util.*;

public class TravelBookingCommonFee {
    abstract static class TravelBooking {
        static final double BOOKING_FEE = 50.0;
        double distanceKm;
        public TravelBooking(double d) { this.distanceKm = d; }
        abstract String getMode();
        abstract double calculateBaseFare();
        public double calculateTotalFare() {
            return calculateBaseFare() + BOOKING_FEE;
        }
    }
    static class BusBooking extends TravelBooking {
        public BusBooking(double d) { super(d); }
        String getMode() { return "BUS"; }
        double calculateBaseFare() { return distanceKm * 2.0; }
    }
    static class TrainBooking extends TravelBooking {
        public TrainBooking(double d) { super(d); }
        String getMode() { return "TRAIN"; }
        double calculateBaseFare() { return distanceKm * 1.5; }
    }
    static class FlightBooking extends TravelBooking {
        public FlightBooking(double d) { super(d); }
        String getMode() { return "FLIGHT"; }
        double calculateBaseFare() { return 2500.0 + distanceKm * 4.0; }
    }
    public static void main(String[] args) {
        List<TravelBooking> bookings = Arrays.asList(
            new BusBooking(200),
            new TrainBooking(300),
            new FlightBooking(500)
        );
        for (TravelBooking b : bookings) {
            System.out.printf(Locale.US, "%s: %.2f%n", b.getMode(), b.calculateTotalFare());
        }
    }
}
