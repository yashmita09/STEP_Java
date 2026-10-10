import java.util.*;

public class HomeApplianceEnergyReport {
    interface SaverCapable {}
    abstract static class Appliance {
        int power; double hours;
        public Appliance(int p, double h) { this.power = p; this.hours = h; }
        abstract String getName();
        public double calculateUnits(boolean saver) {
            double units = (power * hours) / 1000.0;
            return saver ? units * 0.75 : units;
        }
        public double calculateCost(double units) { return units * 8.0; }
    }
    static class Fridge extends Appliance {
        public Fridge(double h) { super(150, h); }
        String getName() { return "FRIDGE"; }
    }
    static class Ac extends Appliance implements SaverCapable {
        public Ac(double h) { super(1500, h); }
        String getName() { return "AC"; }
    }
    static class Tv extends Appliance {
        public Tv(double h) { super(100, h); }
        String getName() { return "TV"; }
    }
    static class Washer extends Appliance implements SaverCapable {
        public Washer(double h) { super(500, h); }
        String getName() { return "WASHER"; }
    }
    public static void main(String[] args) {
        Object[][] requests = {
            {new Fridge(24), false},
            {new Ac(8), true},
            {new Tv(5), false},
            {new Washer(2), true}
        };
        double totalCost = 0;
        for (Object[] req : requests) {
            Appliance app = (Appliance) req[0];
            boolean saver = (Boolean) req[1];
            if (saver && !(app instanceof SaverCapable)) {
                System.out.println(app.getName() + ": saver mode not supported");
            } else {
                double u = app.calculateUnits(saver);
                double c = app.calculateCost(u);
                totalCost += c;
                System.out.printf(Locale.US, "%s: Units=%.2f Cost=%.2f%n", app.getName(), u, c);
            }
        }
        System.out.printf(Locale.US, "Total Cost: %.2f%n", totalCost);
    }
}
