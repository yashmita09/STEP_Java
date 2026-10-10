/**
 * Week 2 Practice - Problem 4: Masked Phone Number Formatter
 * Suggested method signature: String maskPhoneNumber(String phone)
 */
public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) return "Invalid phone number";
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) return "Invalid phone number";
        }
        return "XXXXXX-" + phone.substring(6);
    }

    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("9876543210"));
        System.out.println(maskPhoneNumber("98765"));
    }
}
