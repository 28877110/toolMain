package dataStructure;

import bean.Person;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <Description>list相关的一些小技巧 <br>
 *
 * @author smallfish<br>
 * @version 1.0<br>
 * @createDate 2018/12/20 18:24 <br>
 * @see dataStructure <br>
 */
public class ListBase {

    //list去重 用stream
    public void removeSame(){
        List<Person> personList = Lists.newArrayList(new Person("1","xiaohong"),new Person("2","xiaoming"),new Person("3","xiaogang"),new Person("1","xiaohong"));
        personList.forEach(System.out::println);
        Long start = System.currentTimeMillis();
        personList = personList.stream().distinct().collect(Collectors.toList());
        System.out.println(System.currentTimeMillis()-start);
        personList.forEach(System.out::println);
    }
    //list去重  用第二个list
    public void removeSame2(){
        List<Person> personList = Lists.newArrayList(new Person("1","xiaohong"),new Person("2","xiaoming"),new Person("3","xiaogang"),new Person("1","xiaohong"));
        personList.forEach(System.out::println);
        Long start = System.currentTimeMillis();
        List<Person> result = new ArrayList<>(personList.size());
        for (Person str : personList) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        personList.clear();
        personList.addAll(result);
        System.out.println(System.currentTimeMillis()-start);
        personList.forEach(System.out::println);
    }

}
