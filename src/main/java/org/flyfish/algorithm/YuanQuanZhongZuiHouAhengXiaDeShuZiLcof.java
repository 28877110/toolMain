package org.flyfish.algorithm;

/**
 * @Classname YuanQuanZhongZuiHouAhengXiaDeShuZiLcof
 * @Description https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 * @Date 2020-03-30 22:20
 * @Created by smallfish
 */
public class YuanQuanZhongZuiHouAhengXiaDeShuZiLcof {

    public int lastRemaining(int n, int m) {
        /**
         *
         * 功能描述:0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
         *
         * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
         *
         * @param: [n, m]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-30 22:22
         */
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + m) % i;
        }
        return result;
    }
}
