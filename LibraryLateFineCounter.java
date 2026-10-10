import java.util.*;

public class LibraryLateFineCounter {
    abstract static class Item {
        String title; int daysLate;
        public Item(String t, int d) { title = t; daysLate = d; }
        abstract double calculateFine();
    }
    static class BookItem extends Item {
        public BookItem(String t, int d) { super(t, d); }
        double calculateFine() { return daysLate * 2.0; }
    }
    static class DvdItem extends Item {
        public DvdItem(String t, int d) { super(t, d); }
        double calculateFine() { return Math.min(50.0, daysLate * 5.0); }
    }
    static class MagazineItem extends Item {
        public MagazineItem(String t, int d) { super(t, d); }
        double calculateFine() { return daysLate * 1.0; }
    }
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
            new BookItem("Algebra", 4),
            new DvdItem("Inception", 12),
            new MagazineItem("Sports", 3)
        );
        double total = 0;
        for (Item i : items) {
            double f = i.calculateFine();
            total += f;
            System.out.printf(Locale.US, "%s: %.2f%n", i.title, f);
        }
        System.out.printf(Locale.US, "Total Fines: %.2f%n", total);
    }
}
