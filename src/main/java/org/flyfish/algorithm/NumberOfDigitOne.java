package org.flyfish.algorithm;

/**
 * @Classname NumberOfDigitOne
 * @Description https://leetcode-cn.com/problems/number-of-digit-one/
 * @Date 2020-03-21 13:27
 * @Created by smallfish
 */
public class NumberOfDigitOne {

    public int countDigitOne(int n) {
        /**
         *
         * 功能描述:给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。
         *
         * @param: [n]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-21 13:27
         */
        if (n <= 0) {
            return 0;
        }
//        int result = 0;
//        int ws = 1;
//        for (int i = 1; i <= n; i *= 10) {
//            int tem = i * 10;
//            int digist = n % tem;
//            int jiew = n / tem;
//            if (jiew > 1) {
//                result += (jiew + 1) * i;
//            } else if (jiew == 0) {
//                result += jiew * i;
//            }else if(jiew == 1){
//                result += jiew * i + digist*
//            }
//        }
//        return result;
        int cnt = 0, mul = 1, left = n, right = 0;
        while (left != 0) {
            int digit = left % 10;
            left /= 10;
            if (digit == 0) cnt += left * mul;
            else if (digit == 1) cnt += left * mul + right + 1;
            else cnt += (left + 1) * mul;
            right += digit * mul;
            mul *= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        NumberOfDigitOne numberOfDigitOne = new NumberOfDigitOne();
        int i = numberOfDigitOne.countDigitOne(222);
        System.out.println(i);
    }

}
