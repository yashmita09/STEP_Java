import java.util.Arrays;
import java.util.List;

/**
 * Week 2 Practice - Problem 3: File Extension Validator
 * Suggested method signature: String validateFileExtension(String filename)
 */
public class FileExtensionValidator {

    private static final List<String> ALLOWED = Arrays.asList("pdf", "docx", "zip");

    public static String validateFileExtension(String filename) {
        if (filename == null) return "Rejected — invalid file type";
        int idx = filename.lastIndexOf('.');
        if (idx == -1 || idx == filename.length() - 1) return "Rejected — invalid file type";
        String ext = filename.substring(idx + 1);
        for (String a : ALLOWED) {
            if (a.equalsIgnoreCase(ext)) return "Accepted";
        }
        return "Rejected — invalid file type";
    }

    public static void main(String[] args) {
        System.out.println("Assignment1.PDF -> " + validateFileExtension("Assignment1.PDF"));
        System.out.println("notes.txt       -> " + validateFileExtension("notes.txt"));
    }
}
