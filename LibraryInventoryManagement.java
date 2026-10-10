public class LibraryInventoryManagement {
    static class BookInventory {
        String title, author;
        int copiesAvailable;
        public BookInventory(String t, String a, int c) {
            title = t; author = a; copiesAvailable = c;
        }
        public void printEntry() {
            System.out.println(title + " | " + author + " | Copies: " + copiesAvailable);
        }
    }
    public static void main(String[] args) {
        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 2),
            new BookInventory("Design Patterns", "Erich Gamma", 4)
        };
        for (BookInventory b : books) b.printEntry();
    }
}
