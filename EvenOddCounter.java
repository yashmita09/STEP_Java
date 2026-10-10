public class EvenOddCounter {
    public static void countEvenOdd(int[] numbers) {
        if (numbers == null) return;
        int even = 0, odd = 0;
        for (int n : numbers) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
    public static void main(String[] args) {
        countEvenOdd(new int[]{3, 8, 12, 5, 7, 10});
    }
}
