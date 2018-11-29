package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/11/29 17:13 <br>
 * @see Util <br>
 */
public class CharacterConvertTests {

    @Test
    public void testStringFilter() {
        CharacterConvert characterConvert = new CharacterConvert();
        String testStr = "你好吗●◆†¶⊕1234567\"";
        String result = characterConvert.stringFilter(testStr);
//        assertEquals(testStr, result);
        System.out.println(result);
    }
}
