package org.flyfish.Util;

import java.io.UnsupportedEncodingException;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/11/29 16:30 <br>
 * @see org.flyfish.Util <br>
 */
public class CharacterConvert {

    //在UTF转GBK的时候。发现一些东西无法转。所以用这个来转了 主要去掉一些字符在UTF8里面有的。但是GBK里面没有的
    public String stringFilter(String str) {
        return str.replaceAll("[^\u4E00-\u9FA5\u3000-\u303F\uFF00-\uFFEF\u0000-\u007F\u201c-\u201d]", " ");
    }

    public static void main(String[] args) throws Exception {
        String s1 = new String("dfhk@@@@dfhk时代峰峻你好吗●◆†¶⊕1234567\"".getBytes("UTF-8"),"UTF-8");
        System.out.println(isGBK(s1));
    }

    public static boolean isGBK(String string) throws UnsupportedEncodingException {
        String gbk = new String(string.getBytes("GBK"),"GBK");
        return string.equals(gbk);
    }

}
