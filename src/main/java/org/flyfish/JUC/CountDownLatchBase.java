package org.flyfish.JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @author smallfish
 * @Title: CountDownLatchBase
 * @ProjectName toolMain
 * @date 18-12-3下午8:58
 */
public class CountDownLatchBase {
    //
    public void countDownLatchBase1() throws InterruptedException {
        int threadBase = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadBase);
        for ( int i =0 ;i < threadBase;i++){
            int finalI = i;
            Thread thread = new Thread(() -> {
                System.out.println("thread  start "+ finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread end "+ finalI);

                countDownLatch.countDown();
                System.out.println("会不会执行呢？");
            });
            thread.start();
        }
        countDownLatch.await();
        System.out.println("运行结束");
    }

}
