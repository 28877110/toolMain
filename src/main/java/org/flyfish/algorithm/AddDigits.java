package org.flyfish.algorithm;

/**
 * @Classname AddDigits
 * @Description https://leetcode-cn.com/problems/add-digits/
 * @Date 2020-03-24 09:35
 * @Created by smallfish
 */
public class AddDigits {

    public int addDigits(int num) {
        /**
         *
         * 功能描述: 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
         *
         * @param: [num]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-24 09:36
         */
        if (num == 0) {
            return 0;
        }
        return (num - 1) % 9 + 1;
    }
}
