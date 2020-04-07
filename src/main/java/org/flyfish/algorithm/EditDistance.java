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

        int length = word1.length();
        int width = word2.length();
        int[][] dp = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width ; j++) {

            }
        }
        return result;
    }

}
