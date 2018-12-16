package JUC;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author smallfish
 * @Title: CopyOnWriteArraySetBase
 * @ProjectName toolMain
 * @date 18-12-3下午8:43
 * 查看源码可以看到。CopyOnWriteArraySet是使用CopyOnWriteArrayList实现的
 *
 */
public class CopyOnWriteArraySetBase {
    public void baseFun(){
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("hello");
        copyOnWriteArraySet.add("world");
        copyOnWriteArraySet.add("hello2");
        copyOnWriteArraySet.add("world");
        System.out.println(copyOnWriteArraySet.size());
        copyOnWriteArraySet.forEach(System.out::println);
    }
}
