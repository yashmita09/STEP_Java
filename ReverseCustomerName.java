/**
 * Week 1 Practice - Problem 5: Reverse Customer Name
 * Suggested method signature: String reverseCustomerName(String customerName)
 */
public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {
        if (customerName == null) return null;
        char[] chars = customerName.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++; right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Sunil";
        System.out.println("Original Name: " + original);
        System.out.println("Reversed Name: " + reverseCustomerName(original));
    }
}
