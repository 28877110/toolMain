import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author smallfish
 * @Title: GoogleGuavaUtil
 * @ProjectName toolMain
 * @date 18-9-4下午1:34
 */

public class GoogleGuavaUtil {
    //google Guava的一些功能汇总整理一下

    public void ImmutableMultimapUtil(){
        //不可变map
        ImmutableMultimap<String,String> immutableMultimap1 = ImmutableMultimap.of("name","Tom","age","12");
        System.out.println(immutableMultimap1);
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","Jack");
        hashMap.put("age","13");
        ImmutableMultimap<String,String> immutableMultimap2 = ImmutableMultimap.copyOf(immutableMultimap1);
        System.out.println(immutableMultimap2);
    }

    //主要字符串分割和对list,map的拼合
    public void strUtil(){
        Joiner joiner = Joiner.on(";").skipNulls();
        //Harry;;Ron;Hermione
        System.out.println(joiner.join("Harry","", "Ron", "Hermione"));
        //Harry;Ron;Hermione
        System.out.println(joiner.join("Harry",null, "Ron", "Hermione"));
        ArrayList<String> arrayList = Lists.newArrayList("John", "Jane", null, "Tom");
        //John,Jane,Tom       (跳过null)
        System.out.println(Joiner.on(",").skipNulls().join(arrayList));
        //John,Jane,hello,Tom    (替换null)
        System.out.println(Joiner.on(",").useForNull("hello").join(arrayList));

        HashMap<String,String> hashMap = Maps.newHashMap();
        hashMap.put("name","Jack");
        hashMap.put("age","13");
        hashMap.put("grade","");
        //grade=&&name=Jack&&age=13
        System.out.println(Joiner.on("&&").withKeyValueSeparator("=").join(hashMap));

        String input = "grade=&&name=Jack&&age=13";
        Map<String, String> result = Splitter.on("&&")
                .withKeyValueSeparator("=")
                .split(input);
        //{grade=, name=Jack, age=13}
        System.out.println(result);

    }


}
