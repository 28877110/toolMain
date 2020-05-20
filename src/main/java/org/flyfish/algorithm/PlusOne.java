package org.flyfish.algorithm;

/**
 * @Classname PlusOne
 * @Description https://leetcode-cn.com/problems/plus-one/
 * @Date 2020-05-21 07:18
 * @Created by smallfish
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        /**
         *
         * 功能描述: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
         *
         * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
         *
         * 你可以假设除了整数 0 之外，这个整数不会以零开头。
         *
         * @param: [digits]
         * @return: int[]
         * @auther: smallfish
         * @date: 2020-05-21 07:19
         */
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
