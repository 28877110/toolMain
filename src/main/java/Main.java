import JUC.AtomicBase;
import JUC.PublishAndEscape;
import Other.SystemTime;
import bean.Person;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person("1","hello",1);
        AtomicBase atomicBase = new AtomicBase();
        atomicBase.AtomicTest();
        System.out.println("hello world");
    }

}