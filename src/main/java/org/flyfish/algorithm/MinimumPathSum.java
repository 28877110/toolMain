package org.flyfish.algorithm;

/**
 * @Classname MinimumPathSum
 * @Description https://leetcode-cn.com/problems/minimum-path-sum/
 * @Date 2020-05-10 14:09
 * @Created by smallfish
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        /**
         *
         * 功能描述: 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
         *
         * 说明：每次只能向下或者向右移动一步。
         *
         * @param: [grid]
         * @return: int
         * @auther: smallfish
         * @date: 2020-05-10 14:26
         */
        int[][] a = new int[grid.length][grid[0].length];
        a[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            a[0][i] = grid[0][i]+a[0][i-1];
        }
        for (int j = 1; j < grid[0].length; j++) {
            a[j][0] = grid[j][0] + grid[j-1][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                a[i][j] = Math.min(a[i-1][j],a[i][j-1])+grid[i][j];
            }
        }
        return a[a.length-1][a[0].length-1];
    }
}
