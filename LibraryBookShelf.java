import java.util.Arrays;

/**
 * Problem 3: The Library Book Shelf
 * Insertion sort maintaining shelf in ascending order.
 * Prints shelf state after placing each book (from 2nd book onwards).
 */
public class LibraryBookShelf {
    public static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int key = books[i];
            int j = i - 1;
            while (j >= 0 && books[j] > key) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
            System.out.println("After placing " + key + ": " + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        int[] books = {30, 10, 40, 20};
        System.out.println("Initial shelf: " + Arrays.toString(books));
        shelf(books);
    }
}
