package org.flyfish.algorithm;

/**
 * @Classname RotateMatrixLcci
 * @Description https://leetcode-cn.com/problems/rotate-matrix-lcci/
 * @Date 2020-04-07 20:59
 * @Created by smallfish
 */
public class RotateMatrixLcci {

    public void rotate(int[][] matrix) {
        /**
         *
         * 功能描述: 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
         *
         * 不占用额外内存空间能否做到？
         *
         * @param: [matrix]
         * @return: void
         * @auther: smallfish
         * @date: 2020-04-07 21:00
         */

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tem = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = tem;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tem;
            }
        }

    }
}
