import java.util.*;

public class GardenPlotAreaReport {
    abstract static class Plot {
        String owner;
        public Plot(String o) { this.owner = o; }
        abstract String getShape();
        abstract double calculateArea();
    }
    static class CirclePlot extends Plot {
        double radius;
        public CirclePlot(String o, double r) { super(o); this.radius = r; }
        String getShape() { return "CIRCLE"; }
        double calculateArea() { return Math.PI * radius * radius; }
    }
    static class RectanglePlot extends Plot {
        double length, width;
        public RectanglePlot(String o, double l, double w) { super(o); this.length = l; this.width = w; }
        String getShape() { return "RECTANGLE"; }
        double calculateArea() { return length * width; }
    }
    static class TrianglePlot extends Plot {
        double base, height;
        public TrianglePlot(String o, double b, double h) { super(o); this.base = b; this.height = h; }
        String getShape() { return "TRIANGLE"; }
        double calculateArea() { return 0.5 * base * height; }
    }
    public static void main(String[] args) {
        List<Plot> plots = Arrays.asList(
            new CirclePlot("Asha", 5),
            new RectanglePlot("Ravi", 4, 6),
            new TrianglePlot("Neha", 10, 3)
        );
        double total = 0;
        for (Plot p : plots) {
            double a = p.calculateArea();
            total += a;
            System.out.printf(Locale.US, "%s (%s): %.2f%n", p.owner, p.getShape(), a);
        }
        System.out.printf(Locale.US, "Total Area: %.2f%n", total);
    }
}
