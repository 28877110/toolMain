import JUC.AtomicBase;
import JUC.PublishAndEscape;
import Other.SystemTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicBase atomicBase = new AtomicBase();
        atomicBase.AtomicTest();
        System.out.println("hello world");
    }

}