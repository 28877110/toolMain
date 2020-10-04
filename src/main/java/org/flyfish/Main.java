package org.flyfish;

import com.alibaba.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.service.GenericService;
import org.flyfish.bean.Person;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "./";
        File file = new File(path);
        String targetPath = "./temp";
        File targetPathFile = new File(targetPath);
        Files.createDirectories(targetPathFile.toPath());
        List<Path> collect = Files.walk(file.toPath()).filter(Files::isRegularFile).collect(Collectors.toList());
        List<Path> collect1 = collect.stream().filter(e -> e.toString().endsWith(".qq")).collect(Collectors.toList());
        for (Path path1 : collect1) {
            System.out.println(path1);
            Files.move(path1,targetPathFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }

        Map hmap1 = new HashMap();
        hmap1.put("1","2");
        hmap1.put(null,null);
        if(hmap1 instanceof HashMap){
            HashMap hmap2 = (HashMap)hmap1;
        }else{

        }


        BigDecimal bigDecimal = new BigDecimal("1.23");
        BigDecimal bigDecimal1 = new BigDecimal("1.23");
        System.out.println(bigDecimal.compareTo(bigDecimal1));


        Person person = new Person("1", "2", 1);
        person.setName("222");
        person.setName("234");
        System.out.println(person);
        System.out.println(RandomStringUtils.random(5));
        String phone = null;
        Optional<String> phoneOp = Optional.empty();
        System.out.println(phoneOp.orElse("123"));
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
        String s1 = new String("dfhk@@@@dfhk时代峰峻你好吗●◆†¶⊕1234567\"".getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
//        System.out.println(isGBK(s1));
    }

    public static boolean isGBK(String string) throws UnsupportedEncodingException {
        String gbk = new String(string.getBytes("GBK"), "GBK");
        return string.equals(gbk);
    }
}