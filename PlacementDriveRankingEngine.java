import java.util.*;

public class PlacementDriveRankingEngine {
    public static class Candidate implements Comparable<Candidate> {
        String name; double cgpa; int coding;
        public Candidate(String n, double c, int cd) { name = n; cgpa = c; coding = cd; }
        public double getScore() { return cgpa * 10.0 + coding * 0.5; }
        @Override public int compareTo(Candidate o) {
            return Double.compare(o.getScore(), this.getScore());
        }
    }
    public static boolean isEligible(double cgpa) { return cgpa >= 7.5; }
    public static boolean isEligible(double cgpa, int c) { return cgpa >= 6.5 && c >= 60; }
    public static String shortlistAndRank(Candidate[] cands) {
        List<Candidate> list = new ArrayList<>();
        for (Candidate c : cands) {
            if (isEligible(c.cgpa) || isEligible(c.cgpa, c.coding)) list.add(c);
        }
        Candidate[] arr = list.toArray(new Candidate[0]);
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(String.format(Locale.US, "%d. %s (%.1f)", i + 1, arr[i].name, arr[i].getScore()));
            if (i < arr.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Candidate[] c = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(c));
    }
}
