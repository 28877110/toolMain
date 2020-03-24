package org.flyfish.algorithm;

import java.util.Stack;

/**
 * @Classname L132Pattern
 * @Description https://leetcode-cn.com/problems/132-pattern/
 * @Date 2020-03-22 18:56
 * @Created by smallfish
 */
public class L132Pattern {
    public boolean find132pattern(int[] nums) {
        /**
         *
         * 功能描述:给定一个整数序列：a1, a2, ..., an，一个132模式的子序列 ai, aj, ak 被定义为：当 i < j < k 时，ai < ak < aj。
         * 设计一个算法，当给定有 n 个数字的序列时，验证这个序列中是否含有132模式的子序列。
         *
         * @param: [nums]
         * @return: boolean
         * @auther: smallfish
         * @date: 2020-03-22 18:57
         */
        if (nums.length < 3) {
            return false;
        }
        //这个数组的作用是记录到当前数为止，最小的数
        int[] temmin = new int[nums.length];
        //temmin赋值
        temmin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temmin[i] = Math.min(nums[i], temmin[i - 1]);
        }
        //132模式是否存在判断
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (temmin[i] < nums[i]) {
                while (!stack.isEmpty() && stack.peek() <= temmin[i]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[i]) {
                    return true;
                }
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
