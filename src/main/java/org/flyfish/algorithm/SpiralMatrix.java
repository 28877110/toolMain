package org.flyfish.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname SpiralMatrix
 * @Description https://leetcode-cn.com/problems/spiral-matrix/
 * @Date 2020-03-26 16:47
 * @Created by smallfish
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        /**
         *
         * 功能描述:给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
         *
         * @param: [matrix]
         * @return: java.util.List<java.lang.Integer>
         * @auther: smallfish
         * @date: 2020-03-26 17:22
         */
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int width = matrix.length;
        int length = matrix[0].length;
        //计算层数
        int layer = (Math.min(length, width) + 1) / 2;
        for (int i = 0; i < layer; i++) {
            //上
            for (int j = i; j < length - i; j++) {
                list.add(matrix[i][j]);
            }
            //右
            for (int j = i + 1; j < width - i; j++) {
                list.add(matrix[j][length - 1 - i]);
            }
            //下
            for (int j = length - i - 2; j >= i && width - 1 - i != i; j--) {
                list.add(matrix[width - 1 - i][j]);
            }
            //左
            for (int j = width - i - 2; j >= i + 1 && (length - 1 - i) != i; j--) {
                list.add(matrix[j][i]);
            }
        }
        return list;
    }
}
