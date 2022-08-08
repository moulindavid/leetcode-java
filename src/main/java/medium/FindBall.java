package medium;

public class FindBall {
    private FindBall(){}
    
    public static int[] findBall(int[][] grid) {
        int[] resultGrid = new int[grid[0].length];

        // For each column
        for (int i = 0; i < grid[0].length; i++) {
            resultGrid[i] = computeBallColumnOut(i, grid);
        }
        return resultGrid;
    }

    private static int computeBallColumnOut(int ball, int[][] grid) {
        int currentColumn = ball;
        for (int i = 0; i < grid.length; i++) {
            currentColumn = computeNextColumn(i, currentColumn, grid);
            if (currentColumn == -1) {
                return -1;
            }
        }
        return currentColumn;
    }

    private static int computeNextColumn(int currentRow, int currentColumn, int[][] grid) {
        // Stuck if current row and row where we are heading is opposed. Or if out of bound.
        int movement = grid[currentRow][currentColumn];
        int headingColumn = currentColumn + movement;
        if (headingColumn == -1 || headingColumn >= grid[0].length || grid[currentRow][headingColumn] != movement) {
            return -1;
        }
        return headingColumn;
    }
}
