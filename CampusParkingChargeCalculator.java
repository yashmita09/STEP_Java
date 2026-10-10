import java.util.*;

public class CampusParkingChargeCalculator {
    abstract static class ParkedVehicle {
        int hours;
        public ParkedVehicle(int h) { this.hours = h; }
        abstract String getType();
        abstract double calculateCharge();
    }
    static class Bike extends ParkedVehicle {
        public Bike(int h) { super(h); }
        String getType() { return "BIKE"; }
        double calculateCharge() { return hours * 10.0; }
    }
    static class Car extends ParkedVehicle {
        public Car(int h) { super(h); }
        String getType() { return "CAR"; }
        double calculateCharge() { return hours <= 1 ? 30.0 : 30.0 + (hours - 1) * 20.0; }
    }
    static class Truck extends ParkedVehicle {
        public Truck(int h) { super(h); }
        String getType() { return "TRUCK"; }
        double calculateCharge() { return Math.max(100.0, hours * 50.0); }
    }
    public static void main(String[] args) {
        List<ParkedVehicle> vehicles = Arrays.asList(
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        );
        double total = 0;
        for (ParkedVehicle v : vehicles) {
            double c = v.calculateCharge();
            total += c;
            System.out.printf(Locale.US, "%s: %.2f%n", v.getType(), c);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
