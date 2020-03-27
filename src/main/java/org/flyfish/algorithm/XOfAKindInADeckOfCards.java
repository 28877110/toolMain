package org.flyfish.algorithm;

/**
 * @Classname XOfAKindInADeckOfCards
 * @Description https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * @Date 2020-03-27 22:04
 * @Created by smallfish
 */
public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        /**
         *
         * 功能描述:给定一副牌，每张牌上都写着一个整数。
         *
         * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
         *
         * 每组都有 X 张牌。
         * 组内所有的牌上都写着相同的整数。
         *
         * @param: [deck]
         * @return: boolean
         * @auther: smallfish
         * @date: 2020-03-27 22:05
         */
        int[] b = new int[10001];
        for (int i : deck) {
            b[i]++;
        }
        int x = 0;
        for(int cnt: b) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) { // 如果某步中gcd是1，直接返回false
                    return false;
                }
            }
        }
        return x >= 2;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
