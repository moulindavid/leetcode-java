package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToeplitzMatrixTest {

    @Test
    void isToeplitzMatrix() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        assertTrue(ToeplitzMatrix.isToeplitzMatrix(matrix));
    }
}