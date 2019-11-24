import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        Object o = new Object();
//        int i = CharMatcher.is('@').countIn("dfhk@@@@dfhkj#@");
//        System.out.println(i);
//        String a = "jj" + 1 ;
//        String b ="11";
//        short s = 3;
//        CompletableFuture

        List list = new ArrayList();
//        String s1 = new StringBuilder("ja").append("va").toString();
//        System.out.println(s1.intern() == s1 );
//
//        String s2 = new StringBuilder("计算机").append("软件").toString();
//        System.out.println(s2.intern() == s2 );
//
//        AtomicBase atomicBase = new AtomicBase();
//        atomicBase.AtomicTest();
//        System.out.println("hello world");
//        int a = -111;
//        System.out.println(a >>> 1);
//        Executor executor = new ExecutorThreadPool(200);
////        String path = "./readme.md";
////        File file1 = new File(path);
////        System.out.println(FileType.getEncoding(file1));
//        String file = "./readme.md";
//        String encode = EncodingDetect.getJavaEncode(file);
//        System.out.println(encode);
//        Person person = new Person("1", "hello", 1);
        String s1 = new String("dfhk@@@@dfhk时代峰峻你好吗●◆†¶⊕1234567\"".getBytes("UTF-8"),"UTF-8");
        System.out.println(isGBK(s1));
    }

    public static boolean isGBK(String string) throws UnsupportedEncodingException {
        String gbk = new String(string.getBytes("GBK"),"GBK");
        return string.equals(gbk);
    }
}