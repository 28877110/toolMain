package JUC;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/23 21:40 <br>
 * @see JUC <br>
 */
public class AtomicBase {
    private AtomicLong atomicLong = new AtomicLong(0);
    public void AtomicTest(){
        atomicLong.incrementAndGet();
        System.out.println(atomicLong);
    }
}
