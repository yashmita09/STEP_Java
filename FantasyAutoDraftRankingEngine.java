import java.util.*;

public class FantasyAutoDraftRankingEngine {
    public static class Player implements Comparable<Player> {
        String name; int matches; double avg; boolean injured;
        public Player(String n, int m, double a, boolean inj) {
            name = n; matches = m; avg = a; injured = inj;
        }
        public double getPoints() { return avg * 1.5 + matches * 2.0; }
        @Override public int compareTo(Player o) {
            return Double.compare(o.getPoints(), this.getPoints());
        }
    }
    public static boolean isDraftable(int m) { return m >= 10; }
    public static boolean isDraftable(int m, boolean inj) { return m >= 5 && !inj; }
    public static String draftAndRank(Player[] players) {
        List<Player> list = new ArrayList<>();
        for (Player p : players) {
            if (isDraftable(p.matches) || isDraftable(p.matches, p.injured)) list.add(p);
        }
        Player[] arr = list.toArray(new Player[0]);
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(i + 1).append(". ").append(arr[i].name);
            if (i < arr.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Player[] p = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(p));
    }
}
