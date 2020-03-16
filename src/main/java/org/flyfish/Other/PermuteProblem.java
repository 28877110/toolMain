package org.flyfish.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> 全排列问题的解决办法<br>
 * 具体leetcode的46题
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/24 22:36 <br>
 * @see org.flyfish.Other <br>
 */
public class PermuteProblem {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        help(nums,0,result);
        return result;
    }

    private void help(int[] nums, int index, List<List<Integer>> result){
        if(index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for(int i : nums) {
                temp.add(i);
            }
            result.add(temp);
            return;
        }
        for(int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            help(nums, index + 1, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] num, int a, int b){
        int tem =num[a] ;
        num[a] = num[b];
        num[b] = tem;
    }
}
