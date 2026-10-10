/**
 * Week 2 - Assignment Problem 4: Library ISBN Normalizer & Validator
 * Suggested method signatures:
 *   String normalizeCode(String raw)
 *   String validateAndFormat(String code)
 */
public class LibraryIsbnValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) return null;
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed;
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) return "Invalid: publisher code must be 3 letters";
        }
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) return "Invalid: non-digit body";
        }
        return "[" + code.substring(0, 3) + "] YEAR: " + code.substring(3, 7) + " | CATALOG: " + code.substring(7, 13);
    }

    public static void main(String[] args) {
        System.out.println(validateAndFormat(normalizeCode(" pen2026004251 ")));
        System.out.println(validateAndFormat(normalizeCode("12N2026004251")));
    }
}
