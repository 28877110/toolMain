package org.flyfish.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ValidPalindromeIi
 * @Description TODO
 * @Date 2020-05-21 07:23
 * @Created by smallfish
 */
public class ValidPalindromeIi {

    public static boolean validPalindrome(String s) {
        /**
         *
         * 功能描述:
         *
         * @param: [s]
         * @return: boolean
         * @auther: smallfish
         * @date: 2020-05-21 07:23
         */

        Map<List,String > map = new HashMap<>();
        List<String> a= new ArrayList<>();
        a.add("hell");
        a.add("yx");
        map.put(a,"hhe");
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        validPalindrome("he");
    }

}
