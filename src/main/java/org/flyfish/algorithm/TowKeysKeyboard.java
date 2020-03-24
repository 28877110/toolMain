package org.flyfish.algorithm;

/**
 * @Classname TowKeysKeyboard
 * @Description https://leetcode-cn.com/problems/2-keys-keyboard/
 * @Date 2020-03-22 19:53
 * @Created by smallfish
 */
public class TowKeysKeyboard {

    public int minSteps(int n) {
        /**
         *
         * 功能描述: 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：
         *
         * Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
         * Paste (粘贴) : 你可以粘贴你上一次复制的字符。
         * 给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
         *
         *
         * @param: [n]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-22 19:53
         */
        int result = 0;
        int start = 2;
        while (start > 0) {
            while (n % start == 0) {
                n = n / start;
                result += start;
            }
            start += 1;
            if (n == 1) {
                break;
            }
        }
        return result;
    }
}
