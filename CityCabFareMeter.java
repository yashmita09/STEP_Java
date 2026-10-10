import java.util.*;

public class CityCabFareMeter {
    interface NightServiceable {
        double getNightMultiplier();
    }
    abstract static class Cab {
        double km;
        public Cab(double k) { this.km = k; }
        abstract String getType();
        abstract double getRate();
        public double calculateBaseFare() {
            return Math.max(100.0, km * getRate());
        }
    }
    static class MiniCab extends Cab {
        public MiniCab(double k) { super(k); }
        String getType() { return "MINI"; }
        double getRate() { return 10.0; }
    }
    static class SedanCab extends Cab implements NightServiceable {
        public SedanCab(double k) { super(k); }
        String getType() { return "SEDAN"; }
        double getRate() { return 14.0; }
        public double getNightMultiplier() { return 1.20; }
    }
    static class SuvCab extends Cab implements NightServiceable {
        public SuvCab(double k) { super(k); }
        String getType() { return "SUV"; }
        double getRate() { return 18.0; }
        public double getNightMultiplier() { return 1.20; }
    }
    public static void main(String[] args) {
        Object[][] trips = {
            {new MiniCab(8), "DAY"},
            {new SedanCab(10), "NIGHT"},
            {new SuvCab(20), "DAY"},
            {new MiniCab(5), "NIGHT"}
        };
        double total = 0;
        for (Object[] trip : trips) {
            Cab cab = (Cab) trip[0];
            String time = (String) trip[1];
            if (time.equals("NIGHT") && !(cab instanceof NightServiceable)) {
                System.out.println(cab.getType() + ": night service not available");
            } else {
                double fare = cab.calculateBaseFare();
                if (time.equals("NIGHT")) fare *= ((NightServiceable) cab).getNightMultiplier();
                total += fare;
                System.out.printf(Locale.US, "%s: %.2f%n", cab.getType(), fare);
            }
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
