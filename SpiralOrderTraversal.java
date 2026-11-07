import java.util.*;

/**
 * Problem 8: Spiral Order Traversal
 * Return 2D grid elements clockwise inward.
 * Time Complexity: O(m * n)
 * Space Complexity: O(m * n) for output list
 */
public class SpiralOrderTraversal {
    public static List<Integer> spiralOrder(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        if (grid == null || grid.length == 0 || grid[0].length == 0) return result;

        int top = 0;
        int bottom = grid.length - 1;
        int left = 0;
        int right = grid[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse Right
            for (int j = left; j <= right; j++) {
                result.add(grid[top][j]);
            }
            top++;

            // Traverse Down
            for (int i = top; i <= bottom; i++) {
                result.add(grid[i][right]);
            }
            right--;

            // Traverse Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(grid[bottom][j]);
                }
                bottom--;
            }

            // Traverse Up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(grid[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(spiralOrder(grid)); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
