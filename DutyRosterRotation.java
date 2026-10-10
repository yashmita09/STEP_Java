import java.util.Arrays;

public class DutyRosterRotation {
    public static String[] rotateRoster(String[] names, long k) {
        if (names == null || names.length <= 1) return names;
        int n = names.length;
        int shift = (int) (k % n);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) res[(i + shift) % n] = names[i];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateRoster(new String[]{"A","B","C","D","E"}, 2)));
    }
}
