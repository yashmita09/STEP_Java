public class ExamScoreBandCounter {
    public static int countInBand(int[] scores, int low, int high) {
        if (scores == null || low > high) return 0;
        return upper(scores, high) - lower(scores, low);
    }
    private static int lower(int[] a, int t) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] >= t) r = m; else l = m + 1;
        }
        return l;
    }
    private static int upper(int[] a, int t) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > t) r = m; else l = m + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println(countInBand(new int[]{35, 42, 42, 50, 58, 58, 58, 63, 71, 88}, 42, 58));
    }
}
