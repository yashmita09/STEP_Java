/**
 * Week 1 Practice - Problem 4: First Non-Repeating Character
 * Suggested method signature: char findFirstNonRepeatingChar(String text)
 */
public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) return '\0';
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void test(String text) {
        char ch = findFirstNonRepeatingChar(text);
        if (ch != '\0') System.out.println("\"" + text + "\" First Non-Repeating Character: '" + ch + "'");
        else System.out.println("\"" + text + "\" No Non-Repeating Character Found");
    }

    public static void main(String[] args) {
        test("swiss");
        test("aabbcc");
    }
}
