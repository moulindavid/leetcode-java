package easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        //Input: strs = ["flower","flow","flight"]
        //Output: "fl"
        // ["dog","racecar","car"]
        // ""
        assertThat(LongestCommonPrefix.longestCommonPrefix(new String[] { "dog","racecar","car" })).isEmpty();
    }

}