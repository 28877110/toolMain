package org.flyfish.JUC;

/**
 * thread相关 <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/01 20:36 <br>
 * @see org.flyfish.JUC <br>
 */
public class ThreadBase {

    //最基本的创建方法
    public void createThread() {
        System.out.println("start function");
        Thread a = new Thread("Thread1-a") {
            @Override
            public void run() {
                System.out.println(this.getName() + " start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "end");
            }
        };
        Thread b = new Thread("Thread2-b") {
            @Override
            public void run() {
                System.out.println(this.getName() + " start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "end");
            }
        };
        System.out.println("a start");
        a.start();
        System.out.println("b start");
        b.start();
        System.out.println("function end");
    }

    //死锁经典例子
    public void deadlockExample(){
        String a = "hello";
        String b = "world";
        Thread thread1 = new Thread(() -> {
            System.out.println("start1");
            synchronized (a) {
                System.out.println("thread1  get a");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("thread1 get b");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("start2");
            synchronized (b) {
                System.out.println("thread2 get b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a) {
                    System.out.println("thread1 hget a");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
