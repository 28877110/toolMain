package org.flyfish.optional8;

import org.flyfish.bean.OutBean;
import org.flyfish.bean.Person;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        Optional<OutBean> outBean = Optional.empty();
        OptionalMain optionalMain = new OptionalMain();
        Optional<Person> person = optionalMain.getPerson();
//        Person person1 = person.orElse(new Person("1","jack",1));
//        System.out.println(person1);
//        System.out.println(person1.getSuccess());
//        optionOfNull(person1);
        optionOfNull(null);
        System.out.println(outBean.map(OutBean::getMessage));

    }

    public Optional<Person> getPerson(){
        return Optional.empty();
//        return Optional.of(new Person("2","Tom",2));
    }

    public static void optionOfNull(Person person){
        Optional.ofNullable(person).ifPresent(System.out::println);
    }
}
