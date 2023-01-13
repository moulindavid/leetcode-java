package medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class GenerateParenthesisTest {
    @Test
    void generateParenthesis() {
        assertThat(GenerateParenthesis
                .generateParenthesis(1)).isEqualTo(List.of("()"));
        assertThat(GenerateParenthesis
                .generateParenthesis(3)).isEqualTo(List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
    }

}