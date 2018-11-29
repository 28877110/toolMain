package Util;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/11/29 16:30 <br>
 * @see Util <br>
 */
public class CharacterConvert {

    //zai在UTF转GBK的时候。发现一些东西无法转。所以用这个来转了 主要去掉一些字符在UTF8里面有的。但是GBK里面没有的
    public String stringFilter(String str) {
        return str.replaceAll("[^\u4E00-\u9FA5\u3000-\u303F\uFF00-\uFFEF\u0000-\u007F\u201c-\u201d]", " ");
    }


}
