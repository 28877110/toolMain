package JUC;

/**
 * <Description> <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/01 20:36 <br>
 * @see JUC <br>
 */
public class base {
    public void createThread() {
        System.out.println("start function");
        Thread a = new Thread("Thread1-a") {
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
        System.out.println("funcition end");
    }
}
