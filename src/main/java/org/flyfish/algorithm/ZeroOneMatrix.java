package org.flyfish.algorithm;

/**
 * @Classname ZeroOneMatrix
 * @Description https://leetcode-cn.com/problems/01-matrix/
 * @Date 2020-03-19 12:16
 * @Created by smallfish
 */
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        /**
         *
         * 功能描述:给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
         *
         * 两个相邻元素间的距离为 1 。
         *
         * @param: [matrix]
         * @return: int[][]
         * @auther: smallfish
         * @date: 2020-03-19 12:16
         */
        if (matrix.length == 0) {
            return matrix;
        }
        int width = matrix.length;
        int length = matrix[0].length;
        int[][] result = new int[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = Integer.MAX_VALUE - 1;
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (matrix[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    if (i > 0) {
                        result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                    }
                    if (j > 0) {
                        result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
                    }
                }
            }
        }

        for (int i = width - 1; i >= 0; i--) {
            for (int j = length - 1; j >= 0; j--) {
                if (i < width - 1) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                }
                if (j < length - 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
                }
            }
        }

        return result;
    }
}
