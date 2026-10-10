import java.util.*;

public class ParcelShippingDesk {
    interface Insurable {
        double calculateInsurance();
    }
    abstract static class Parcel {
        double weight, declaredValue;
        public Parcel(double w, double v) { weight = w; declaredValue = v; }
        abstract String getType();
        abstract double calculateCharge();
    }
    static class StandardParcel extends Parcel {
        public StandardParcel(double w, double v) { super(w, v); }
        String getType() { return "STANDARD"; }
        double calculateCharge() { return 40.0 + 10.0 * weight; }
    }
    static class ExpressParcel extends Parcel implements Insurable {
        public ExpressParcel(double w, double v) { super(w, v); }
        String getType() { return "EXPRESS"; }
        double calculateCharge() { return 80.0 + 15.0 * weight; }
        public double calculateInsurance() { return declaredValue * 0.02; }
    }
    static class FragileParcel extends Parcel implements Insurable {
        public FragileParcel(double w, double v) { super(w, v); }
        String getType() { return "FRAGILE"; }
        double calculateCharge() { return (40.0 + 10.0 * weight) + 50.0; }
        public double calculateInsurance() { return declaredValue * 0.02; }
    }
    public static void main(String[] args) {
        List<Parcel> parcels = Arrays.asList(
            new StandardParcel(3, 500),
            new ExpressParcel(2, 1000),
            new FragileParcel(4, 2000)
        );
        double grandTotal = 0;
        for (Parcel p : parcels) {
            double chg = p.calculateCharge();
            double ins = (p instanceof Insurable) ? ((Insurable) p).calculateInsurance() : 0.0;
            double tot = chg + ins;
            grandTotal += tot;
            System.out.printf(Locale.US, "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", p.getType(), chg, ins, tot);
        }
        System.out.printf(Locale.US, "Grand Total: %.2f%n", grandTotal);
    }
}
