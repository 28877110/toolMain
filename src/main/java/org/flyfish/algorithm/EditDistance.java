package org.flyfish.algorithm;

/**
 * @Classname EditDistance
 * @Description https://leetcode-cn.com/problems/edit-distance/
 * @Date 2020-04-06 17:14
 * @Created by smallfish
 */
public class EditDistance {

    public int minDistance(String word1, String word2) {
        /**
         *
         * 功能描述:给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
         *
         * 你可以对一个单词进行如下三种操作：
         *
         * 插入一个字符
         * 删除一个字符
         * 替换一个字符
         *
         * @param: [word1, word2]
         * @return: int
         * @auther: smallfish
         * @date: 2020-04-06 17:15
         */
        int result = 0;

        int length = word1.length() + 1;
        int width = word2.length() + 1;
        int[][] dp = new int[length][width];
        dp[0][0] = 0;
        for (int i = 0; i < length; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < width; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < length; i++) {
            for (int j = 1; j < width; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1))
                    left_down += 1;
                dp[i][j] = Math.min(left, Math.min(down, left_down));

            }
        }
        return dp[length-1][width-1];
    }

}
