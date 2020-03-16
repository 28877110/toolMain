package org.flyfish.Other;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/23 20:42 <br>
 * @see org.flyfish.Other <br>
 */
public class SystemTime {
//    System.nanoTime和System.currentTimeMillis
    public void SystemTime1() throws InterruptedException {
        long startNano = System.nanoTime();
        long startCurrent =System.currentTimeMillis();
        Thread.sleep(1000);
        long endNano = System.nanoTime();
        long endCurrent = System.currentTimeMillis();
        System.out.println(endNano - startNano);
        System.out.println(endCurrent - startCurrent);
    }
}
