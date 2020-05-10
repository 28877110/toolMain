package org.flyfish.algorithm;

/**
 * @Classname SubtractTheProductAndSumOfDigitsOfAnInteger
 * @Description https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * @Date 2020-05-10 15:12
 * @Created by smallfish
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        /**
         *
         * 功能描述:给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
         *
         * @param: [n]
         * @return: int
         * @auther: smallfish
         * @date: 2020-05-10 15:13
         */
        int sum = 0;
        int ji = 1;
        while (n != 0) {
            int g = n % 10;
            n = n / 10;
            sum += g;
            ji *= g;
        }
        return ji - sum;
    }
}
