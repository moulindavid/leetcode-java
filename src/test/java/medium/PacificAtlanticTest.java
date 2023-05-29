package medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class PacificAtlanticTest {

    @Test
    void pacificAtlantic() {
        int[][] heights = new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        assertThat(PacificAtlantic.pacificAtlantic(heights)).contains(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1), List.of(4, 0));
    }

}