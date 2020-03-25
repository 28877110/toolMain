package org.flyfish.algorithm;

/**
 * @Classname TheMasseuseIcci
 * @Description https://leetcode-cn.com/problems/the-masseuse-lcci/
 * @Date 2020-03-24 09:01
 * @Created by smallfish
 */
public class TheMasseuseIcci {

    public int massage(int[] nums) {
        /**
         *
         * 功能描述:一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。
         * 给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
         *
         *
         * @param: [nums]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-24 09:01
         */
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] tem = new int[nums.length];
        int temLength = tem.length;
        tem[0] = nums[0];
        tem[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            int temint = nums[i] + tem[i - 2];
            tem[i] = temint > tem[i - 1] ? temint : tem[i - 1];
        }
        return tem[temLength - 1] > tem[temLength - 2] ? tem[temLength - 1] : tem[temLength - 2];
    }
}
