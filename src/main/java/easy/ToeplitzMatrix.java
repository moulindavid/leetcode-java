package easy;

public class ToeplitzMatrix {

    private ToeplitzMatrix() {
    }

    /**
     * Compare With Top-Left Neighbor.
     */
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 1; column < matrix[row].length; column++) {
                if (matrix[row][column] != matrix[row - 1][column - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
