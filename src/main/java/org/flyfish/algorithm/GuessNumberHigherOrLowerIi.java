package org.flyfish.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname GuessNumberHigherOrLowerIi
 * @Description https://leetcode-cn.com/problems/guess-number-higher-or-lower-ii/
 * @Date 2020-05-10 14:40
 * @Created by smallfish
 */
public class GuessNumberHigherOrLowerIi {
    //todo 没完成

    public int getMoneyAmount(int n) {
        if (n == 1) {
            return 0;
        }
        int start = 1;
        int end = n;
        int mid = (start + end) / 2;
        int result = 0;
        while (true) {
            result += mid;
            if (mid == end - 1 || mid == end) {
                break;
            }
            start = mid;
            mid = (start + end) / 2;
        }
        return result;
    }

}
