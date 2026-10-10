public class DigitSumAndReversal {
    public static void processNumber(int number) {
        int temp = Math.abs(number);
        int sum = 0, reversed = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            reversed = reversed * 10 + d;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }
    public static void main(String[] args) {
        processNumber(4721);
    }
}
