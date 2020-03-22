package org.flyfish.algorithm;

import java.util.Arrays;

/**
 * @Classname MinimumIncrementToMakeArrayUnique
 * @Description https://leetcode-cn.com/problems/minimum-increment-to-make-array-unique/
 * @Date 2020-03-22 11:20
 * @Created by smallfish
 */
public class MinimumIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {
        /**
         *
         * 功能描述: 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
         *
         * 返回使 A 中的每个值都是唯一的最少操作次数。
         *
         * @param: [A]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-22 15:52
         */
        int result = 0;
        //排序
        Arrays.sort(A);
        for (int i : A) {
            System.out.println(i);
        }
        //对每个元素操作
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                //记下A[i]
                int tem = A[i];
                A[i] = A[i - 1] + 1;
                result += A[i] - tem;
            }
        }
        return result;
    }

}
