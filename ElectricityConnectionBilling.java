import java.util.*;

public class ElectricityConnectionBilling {
    abstract static class Connection {
        int units;
        public Connection(int u) { this.units = u; }
        abstract String getType();
        abstract double calculateBill();
    }
    static class HomeConnection extends Connection {
        public HomeConnection(int u) { super(u); }
        String getType() { return "HOME"; }
        double calculateBill() {
            return units <= 100 ? units * 5.0 : 100 * 5.0 + (units - 100) * 7.0;
        }
    }
    static class ShopConnection extends Connection {
        public ShopConnection(int u) { super(u); }
        String getType() { return "SHOP"; }
        double calculateBill() { return units * 8.0 + 100.0; }
    }
    static class FactoryConnection extends Connection {
        public FactoryConnection(int u) { super(u); }
        String getType() { return "FACTORY"; }
        double calculateBill() { return Math.max(1000.0, units * 6.0); }
    }
    public static void main(String[] args) {
        List<Connection> list = Arrays.asList(
            new HomeConnection(150),
            new ShopConnection(90),
            new FactoryConnection(120)
        );
        double total = 0;
        for (Connection c : list) {
            double b = c.calculateBill();
            total += b;
            System.out.printf(Locale.US, "%s: %.2f%n", c.getType(), b);
        }
        System.out.printf(Locale.US, "Total: %.2f%n", total);
    }
}
