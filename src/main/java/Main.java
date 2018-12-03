import java.io.IOException;

public class Main {
    public static String a = "hello";
    public static String b = "world";

    public static void main(String[] args) throws IOException {
        System.out.println("hello world");

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