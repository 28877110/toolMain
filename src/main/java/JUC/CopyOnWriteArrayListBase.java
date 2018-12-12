package JUC;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author smallfish
 * @Title: CopyOnWriteArrayListBase
 * @ProjectName toolMain
 * @date 18-12-3下午8:46
 * CopyOnWriteArrayList适用于在度多写少上
 * 同样的 CopyOnWrite容器存在这样的问题1.内存占用多2.数据一致性弱的问题
 * 数据一致性在你写入的时候,并不一定读到。
 */
public class CopyOnWriteArrayListBase {
    public void baseFun(){
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("hello");
        copyOnWriteArrayList.add("world");
        copyOnWriteArrayList.forEach(System.out::println);
    }
}
