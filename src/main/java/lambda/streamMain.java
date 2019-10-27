package lambda;

import bean.Person;

import java.util.ArrayList;

public class streamMain {
    public static void main(String[] args){
        System.out.println("hello");
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("1","A",1));
        list.add(new Person("2","B",1));
        list.add(new Person("3","C",1));
        list.forEach(System.out::println);
        //用并行流来进行元素的修改
        list.parallelStream().forEach(item -> item.setName(item.getName() + " stream"));
        list.forEach(System.out::println);
    }
}
