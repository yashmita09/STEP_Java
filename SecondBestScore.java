public class SecondBestScore {
    public static int secondHighest(int[] scores) {
        if (scores == null || scores.length < 2) return -1;
        int h = -1, s = -1;
        for (int sc : scores) {
            if (sc > h) { s = h; h = sc; }
            else if (sc < h && sc > s) s = sc;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(secondHighest(new int[]{45, 78, 92, 78, 60}));
    }
}
