import java.util.Arrays;

public class FantasyScoreMultiplier {
    public static void applyMultipliers(double[] scores, int cIdx, int vcIdx) {
        if (scores == null) return;
        if (cIdx >= 0 && cIdx < scores.length) scores[cIdx] *= 2.0;
        if (vcIdx >= 0 && vcIdx < scores.length) scores[vcIdx] *= 1.5;
    }
    public static void main(String[] args) {
        double[] s = {45.0, 60.0, 80.0, 30.0};
        applyMultipliers(s, 2, 1);
        System.out.println(Arrays.toString(s));
    }
}
