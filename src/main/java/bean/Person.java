package bean;

import lombok.Data;

@Data
public class Person {
    private String Id;
    private String name;

    public Person(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }
}
