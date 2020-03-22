package org.flyfish.algorithm;

import java.util.PriorityQueue;

/**
 * @Classname ZuiXiaoDeKgeShuIcof
 * @Description https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 * @Date 2020-03-20 10:59
 * @Created by smallfish
 */
public class ZuiXiaoDeKgeShuIcof {

    public int[] getLeastNumbers(int[] arr, int k) {
        /**
         *
         * 功能描述:输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
         *
         *
         * @param: [arr, k]
         * @return: int[]
         * @auther: smallfish
         * @date: 2020-03-20 10:59
         */
        if (k == 0) {
            return new int[0];
        }
        int[] result = new int[k];
        //建大小为k的大顶堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);
        //填满大顶堆
        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }
        //堆满后，如果堆顶大于数组的数，则去掉堆顶数，加入数组内数字。
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < priorityQueue.peek()) {
                priorityQueue.remove();
                priorityQueue.add(arr[i]);
            }
        }
        //输出结果到result中
        int start = 0;
        while (priorityQueue.size() > 0) {
            result[start++] = priorityQueue.remove();

        }
        return result;
    }

}
