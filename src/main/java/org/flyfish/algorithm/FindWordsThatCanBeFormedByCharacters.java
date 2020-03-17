package org.flyfish.algorithm;

/**
 * @Classname FindWordsThatCanBeFormedByCharacters
 * @Description https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * @Date 2020-03-17 13:36
 * @Created by smallfish
 */
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        /**
         *
         * 功能描述:给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
         *
         * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
         *
         * 注意：每次拼写时，chars 中的每个字母都只能用一次。
         *
         * 返回词汇表 words 中你掌握的所有单词的 长度之和。
         *
         * @param: [words, chars]
         * @return: int
         * @auther: smallfish
         * @date: 2020-03-17 13:37
         */
        int result = 0;
        //打字母表
        int[] letter = getLetter(chars);
        for (String word : words) {
            int[] wordLetter = getLetter(word);
            if (count(wordLetter, letter)) {
                result += word.length();
            }
        }
        return result;
    }

    //将单词变成个数字母表
    private int[] getLetter(String chars) {
        int[] letter = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            letter[chars.charAt(i) - 'a']++;
        }
        return letter;
    }

    //比较字母表
    private boolean count(int[] wordLetter, int[] letter) {
        for (int i = 0; i < wordLetter.length; i++) {
            if (wordLetter[i] > letter[i]) {
                return false;
            }
        }
        return true;
    }

}
