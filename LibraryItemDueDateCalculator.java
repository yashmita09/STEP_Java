import java.time.LocalDate;
import java.util.*;

public class LibraryItemDueDateCalculator {
    abstract static class LibraryItem {
        String title;
        public LibraryItem(String t) { this.title = t; }
        abstract LocalDate calculateDueDate(LocalDate current);
    }
    static class BookItem extends LibraryItem {
        public BookItem(String t) { super(t); }
        LocalDate calculateDueDate(LocalDate c) { return c.plusDays(14); }
    }
    static class DvdItem extends LibraryItem {
        public DvdItem(String t) { super(t); }
        LocalDate calculateDueDate(LocalDate c) { return c.plusDays(7); }
    }
    static class MagazineItem extends LibraryItem {
        public MagazineItem(String t) { super(t); }
        LocalDate calculateDueDate(LocalDate c) { return c.plusDays(3); }
    }
    public static void main(String[] args) {
        LocalDate current = LocalDate.parse("2023-10-26");
        List<LibraryItem> items = Arrays.asList(
            new BookItem("1984"),
            new DvdItem("The Matrix"),
            new MagazineItem("Forbes Issue 500")
        );
        for (LibraryItem item : items) {
            System.out.println(item.title + ": " + item.calculateDueDate(current));
        }
    }
}
