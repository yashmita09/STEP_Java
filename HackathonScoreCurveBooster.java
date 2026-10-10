import java.util.Arrays;

public class HackathonScoreCurveBooster {
    public static void curveScores(int[] scores, int bonus) {
        if (scores == null || bonus < 0) return;
        for (int i = 0; i < scores.length; i++) scores[i] += bonus;
    }
    public static void main(String[] args) {
        int[] sc = {70, 85, 60};
        curveScores(sc, 10);
        System.out.println(Arrays.toString(sc));
    }
}
