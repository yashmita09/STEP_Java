public class LeapYearDetector {
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024) ? "Leap year" : "Not a leap year");
        System.out.println(isLeapYear(1900) ? "Leap year" : "Not a leap year");
        System.out.println(isLeapYear(2000) ? "Leap year" : "Not a leap year");
    }
}
