package org.flyfish.algorithm;

/**
 * @Classname CompressStringLcci
 * @Description https://leetcode-cn.com/problems/compress-string-lcci/
 * @Date 2020-03-16 21:16
 * @Created by smallfish
 */
public class CompressStringLcci {

    public String compressString(String S) {
        /**
         *
         * 功能描述: 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
         * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串
         *
         *
         * @param: [S]
         * @return: java.lang.String
         * @auther: smallfish
         * @date: 2020-03-16 21:18
         */
        if (S == null || S.length() == 0) {
            return S;
        }
        //记录次数
        int times = 1;

        StringBuilder stringBuilder = new StringBuilder();
        char start = S.charAt(0);
        stringBuilder.append(start);

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                times++;
            } else {
                //加数字
                stringBuilder.append(times);
                //加字母
                stringBuilder.append(S.charAt(i));
                //次数恢复成1
                times = 1;
            }

        }
        //遍历完成后需要增加最后的完成次数
        stringBuilder.append(times);
        if (stringBuilder.length() < S.length()) {
            return stringBuilder.toString();
        }
        return S;

    }

    public static void main(String[] args) {

    }
}
