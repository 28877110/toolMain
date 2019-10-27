import JUC.AtomicBase;
import Util.EncodingDetect;
import bean.Person;
import org.eclipse.jetty.util.thread.ExecutorThreadPool;

import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        AtomicBase atomicBase = new AtomicBase();
        atomicBase.AtomicTest();
        System.out.println("hello world");
        int a = -111;
        System.out.println(a >>> 1);
        Executor executor = new ExecutorThreadPool(200);
//        String path = "./readme.md";
//        File file1 = new File(path);
//        System.out.println(FileType.getEncoding(file1));
        String file = "./readme.md";
        String encode = EncodingDetect.getJavaEncode(file);
        System.out.println(encode);
        Person person = new Person("1", "hello", 1);
    }
}