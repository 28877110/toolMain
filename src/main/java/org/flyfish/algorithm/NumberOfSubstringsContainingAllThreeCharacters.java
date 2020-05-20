package org.flyfish.algorithm;

/**
 * @Classname NumberOfSubstringsContainingAllThreeCharacters
 * @Description https://leetcode-cn.com/problems/number-of-substrings-containing-all-three-characters/
 * @Date 2020-05-11 12:27
 * @Created by smallfish
 */
public class NumberOfSubstringsContainingAllThreeCharacters {

    public int numberOfSubstrings(String s) {
        /**
         *
         * 功能描述: 给你一个字符串 s ，它只包含三种字符 a, b 和 c 。
         *
         * 请你返回 a，b 和 c 都 至少 出现过一次的子字符串数目。
         *
         * @param: [s]
         * @return: int
         * @auther: smallfish
         * @date: 2020-05-11 13:35
         */
        int num = 0;
        int len = s.length();
        if (len < 3) {
            return 0;
        }
        int start = 0 ;
        int end = 2;
        while(end<=len){
            String tem = s.substring(start,end);
            if(tem.contains("a")&&tem.contains("b")&&tem.contains("c")){
                num+=len-end+1;
                start++;
            }else {
                end++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        NumberOfSubstringsContainingAllThreeCharacters numberOfSubstringsContainingAllThreeCharacters = new NumberOfSubstringsContainingAllThreeCharacters();
        System.out.println(numberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings("abcabc"));
    }
}
