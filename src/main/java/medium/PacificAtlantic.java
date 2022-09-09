package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pacific-atlantic-water-flow/
 */
public class PacificAtlantic {
    private PacificAtlantic() {
    }
    /**
     * There is an m x n rectangular island that borders both the Pacific Ocean and Atlantic Ocean. The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's right and bottom edges.
     * <p>
     * The island is partitioned into a grid of square cells. You are given an m x n integer matrix heights where heights[r][c] represents the height above sea level of the cell at coordinate (r, c).
     * <p>
     * The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is less than or equal to the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.
     * <p>
     * Return a 2D list of grid coordinates result where result[i] = [ri, ci] denotes that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic oceans.
     *
     * @param heights
     * @return
     */
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] canFlowToPacific = new boolean[rows][cols];
        boolean[][] canFlowToAtlantic = new boolean[rows][cols];

        for (int col = 0; col < cols; col++) {
            depthFirstSearch(0, col, rows, cols, canFlowToPacific, heights[0][col], heights);
            depthFirstSearch(rows - 1, col, rows, cols, canFlowToAtlantic, heights[rows - 1][col], heights);
        }
        for (int row = 0; row < rows; row++) {
            depthFirstSearch(row, 0, rows, cols, canFlowToPacific, heights[row][0], heights);
            depthFirstSearch(row, cols - 1, rows, cols, canFlowToAtlantic, heights[row][cols - 1], heights);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (canFlowToPacific[i][j] && canFlowToAtlantic[i][j])
                    result.add(Arrays.asList(i, j));
            }
        return result;
    }

    private static void depthFirstSearch(int row, int col, int rows, int cols, boolean[][] visited, int prevHeight, int[][] heights) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || prevHeight > heights[row][col]){
            return;
        }
        visited[row][col] = true;
        //Evaluate position around initial one.
        depthFirstSearch(row + 1, col, rows, cols, visited, heights[row][col], heights);
        depthFirstSearch(row - 1, col, rows, cols, visited, heights[row][col], heights);
        depthFirstSearch(row, col + 1, rows, cols, visited, heights[row][col], heights);
        depthFirstSearch(row, col - 1, rows, cols, visited, heights[row][col], heights);
    }
}
