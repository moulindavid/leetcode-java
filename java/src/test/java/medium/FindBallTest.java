package medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindBallTest {

    @Test
    void findBall() {
        /*
         * Input: grid = [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
         * Output: [1,-1,-1,-1,-1]
         */
        assertThat(FindBall
                .findBall(new int[][]{{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}}))
                .isEqualTo(new int[]{1, -1, -1, -1, -1});
    }
}