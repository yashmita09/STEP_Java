public class BusiestBusRow {
    public static String busiestRow(int[][] grid) {
        if (grid == null || grid.length == 0) return "Row 0, Total 0";
        int bestRow = 0, maxTotal = -1;
        for (int r = 0; r < grid.length; r++) {
            int sum = 0;
            if (grid[r] != null) for (int c : grid[r]) sum += c;
            if (sum > maxTotal) { maxTotal = sum; bestRow = r; }
        }
        return "Row " + bestRow + ", Total " + maxTotal;
    }
    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        System.out.println(busiestRow(grid));
    }
}
