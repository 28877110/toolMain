package Util;

import bean.Person;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * @author smallfish
 * @Title: Util.GoogleGuavaUtil
 * @ProjectName toolMain
 * @date 18-9-4下午1:34
 */

public class GoogleGuavaUtil {
    //google Guava的一些功能汇总整理一下

    public void ImmutableMultimapUtil(){
        //不可变map
        ImmutableMultimap<String,String> immutableMultimap1 = ImmutableMultimap.of("name","Tom","age","12");
        System.out.println(immutableMultimap1);
        HashMap<String,String> hashMap = Maps.newHashMap();
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

    public void CollectionToMap(){
        Person p1 = new Person("001", "Harry",1);
        Person p2 = new Person("002", "Ron",1);
        Person p3 = new Person("003","Hermione",1);
        List<Person> personList = Lists.newArrayList();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        // 将主键当作Map的Key
        Map<String, Person> personMap = Maps.uniqueIndex(personList, Person::getId);
        //{001=Person(Id=001, name=zhang_san), 002=Person(Id=002, name=li_si), 003=Person(Id=003, name=xiao_hong)}
        System.out.println("将主键当作Map的Key:" + personMap);


        // 可以说是Maps.uniqueIndex相反的作用
        Set<Person> personSet = Sets.newHashSet(p1, p2);
        Map personAsMap= Maps.asMap(personSet, Person::getId);
        System.out.println(personAsMap);


        // 转换Map中的value值
        Map<String, String> transformValuesMap = Maps.transformValues(personMap, Person::getName);
        System.out.println("转换Map中的value值" + transformValuesMap);

    }


}
