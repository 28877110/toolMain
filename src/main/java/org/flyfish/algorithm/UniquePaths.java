package org.flyfish.algorithm;

/**
 * @Classname UniquePaths
 * @Description https://leetcode-cn.com/problems/unique-paths/
 * @Date 2020-05-10 14:29
 * @Created by smallfish
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        /**
         *
         * 功能描述: 
         *
         * @param: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
         *
         * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
         *
         * 问总共有多少条不同的路径？
         *
         * @return: int
         * @auther: smallfish
         * @date: 2020-05-10 14:34
         */
        int a[][] = new int[m][n];
        a[0][0] = 0;
        for (int i = 0; i < n; i++) {
            a[0][i] = 1;
        }
        for (int j = 0; j < m; j++) {
            a[j][0] = 1;
        }
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                a[i][j] = a[i-1][j]+a[i][j-1];
            }
        }
        return a[m-1][n-1];
    }
}
