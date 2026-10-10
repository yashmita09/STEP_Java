import java.util.*;

public class HostelElectricityBill {
    abstract static class Room {
        int units;
        public Room(int u) { this.units = u; }
        abstract String getType();
        abstract double calculateBill();
    }
    static class SingleRoom extends Room {
        public SingleRoom(int u) { super(u); }
        String getType() { return "SINGLE"; }
        double calculateBill() { return units * 8.0; }
    }
    static class SharedRoom extends Room {
        int occupants;
        public SharedRoom(int u, int occ) { super(u); this.occupants = occ; }
        String getType() { return "SHARED"; }
        double calculateBill() { return (units * 6.0) / occupants; }
    }
    static class AcRoom extends Room {
        public AcRoom(int u) { super(u); }
        String getType() { return "AC"; }
        double calculateBill() { return units * 10.0 + 200.0; }
    }
    public static void main(String[] args) {
        List<Room> rooms = Arrays.asList(
            new SingleRoom(120),
            new SharedRoom(150, 3),
            new AcRoom(100)
        );
        double total = 0;
        for (Room r : rooms) {
            double b = r.calculateBill();
            total += b;
            System.out.printf(Locale.US, "%s: %.2f%n", r.getType(), b);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
