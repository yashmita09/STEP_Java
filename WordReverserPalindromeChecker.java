public class WordReverserPalindromeChecker {
    public static void checkWord(String word) {
        if (word == null) return;
        String rev = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(rev)) {
            System.out.println(word + " - palindrome");
        } else {
            System.out.println(rev + " - not a palindrome");
        }
    }
    public static void main(String[] args) {
        checkWord("level");
        checkWord("java");
    }
}
