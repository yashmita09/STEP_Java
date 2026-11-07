import java.util.Arrays;

/**
 * Problem 2: Warehouse Bin Grid Scan
 * Scans 2D grid of m rows and n columns, returns total count and (row, col) of maximum bin.
 * Time Complexity: O(m * n)
 * Additional Space Complexity: O(1)
 */
public class WarehouseBinGridScan {
    public static class Summary {
        public int total;
        public int maxRow;
        public int maxCol;
        public int maxValue;

        public Summary(int total, int maxRow, int maxCol, int maxValue) {
            this.total = total;
            this.maxRow = maxRow;
            this.maxCol = maxCol;
            this.maxValue = maxValue;
        }

        @Override
        public String toString() {
            return "total = " + total + ", maxCoordinate = (" + maxRow + ", " + maxCol + ")";
        }
    }

    public static Summary warehouseSummary(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return new Summary(0, -1, -1, 0);
        }
        int total = 0;
        int maxVal = -1;
        int maxR = 0, maxC = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                int val = grid[r][c];
                total += val;
                if (val > maxVal) {
                    maxVal = val;
                    maxR = r;
                    maxC = c;
                }
            }
        }
        return new Summary(total, maxR, maxC, maxVal);
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4, 9, 2},
            {7, 1, 6},
            {3, 12, 5}
        };
        Summary res = warehouseSummary(grid);
        System.out.println(res); // total = 49, maxCoordinate = (2, 1)
    }
}
