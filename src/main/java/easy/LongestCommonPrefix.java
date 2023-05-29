package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    private LongestCommonPrefix() {
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            //We reduce the prefix until he fits for the current evaluating word.
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        return prefix;
    }


    public static String longestCommonPrefixSortingArray(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        if (strs.length == 1) {
            return prefix;
        }
        Arrays.sort(strs);
        int charIndex = 0;
        String longestWord = strs[0];
        String shortestWord = strs[strs.length - 1];
        int minLen = Math.min(longestWord.length(), shortestWord.length());
        StringBuilder sb = new StringBuilder();

        while (charIndex < minLen && longestWord.charAt(charIndex) == shortestWord.charAt(charIndex)){
            sb.append(longestWord.charAt(charIndex++));
        }

        return sb.toString();
    }
}