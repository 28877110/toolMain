package org.flyfish.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Classname MergeIntervals
 * @Description https://leetcode-cn.com/problems/merge-intervals/
 * @Date 2020-03-25 20:37
 * @Created by smallfish
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        /**
         *
         * 功能描述: 给出一个区间的集合，请合并所有重叠的区间。
         *
         * @param: [intervals]
         * @return: int[][]
         * @auther: smallfish
         * @date: 2020-03-25 21:28
         */
        int length = intervals.length;
        if (length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> list = new ArrayList();
        int startX = intervals[0][0];
        int startY = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] <= startY) {
                startY = Math.max(interval[1], startY);
                startX = Math.min(interval[0], startX);
            } else {
                list.add(new int[]{startX, startY});
                startX = interval[0];
                startY = interval[1];
            }
        }
        list.add(new int[]{startX, startY});
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
    }
}
