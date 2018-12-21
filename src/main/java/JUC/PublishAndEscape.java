package JUC;

import java.util.Arrays;

/**
 * <Description> 发布和逸出 <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/20 18:23 <br>
 * @see JUC <br>
 */
public class PublishAndEscape {
    public void publishLetter(){
        Hello hello = new Hello();
        String[] a = hello.getLetter();
        a[1] = "a";
        String[] b = hello.getLetter();
        System.out.println(Arrays.toString(b));
        Hello hello2 = new Hello();
        String[] c = hello2.letter;
        System.out.println(Arrays.toString(c));
    }

    class Hello{
        private String[] letter = new String[]{
                "q","w","e","r"
        };

        public String[] getLetter() {
            return letter;
        }
    }
}
