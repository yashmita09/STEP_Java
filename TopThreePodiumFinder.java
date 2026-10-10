import java.util.Arrays;

public class TopThreePodiumFinder {
    public static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for (int sc : scores) {
            if (sc >= first) {
                third = second; second = first; first = sc;
            } else if (sc >= second) {
                third = second; second = sc;
            } else if (sc > third) {
                third = sc;
            }
        }
        return new int[]{first, second, third};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
    }
}
