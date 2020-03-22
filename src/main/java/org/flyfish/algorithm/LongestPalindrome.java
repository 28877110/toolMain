package org.flyfish.algorithm;

/**
 * @Classname LongestPalindrome
 * @Description https://leetcode-cn.com/problems/longest-palindrome/
 * @Date 2020-03-19 22:41
 * @Created by smallfish
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        /**
         *
         * 功能描述: 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
         *
         * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
         *
         * @param: [s]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-19 22:43
         */
        int length = s.length();
        int[] chars = new int[150];
        for (int i = 0; i < length; i++) {
            chars[s.charAt(i) - 'A']++;
        }
        int result = 0;
        for (int aChar : chars) {
            if (aChar % 2 == 0) {
                result += aChar;
            } else {
                result += aChar - 1;
            }
        }
        if (result < length) {
            result += 1;
        }
        return result;
    }

}
