package Collections.linkedList;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList2 {
    public static void main(String[] args) {


        List<Person> list = new LinkedList<>();
        Person p1 = new Person("Anna");
        Person p2 = new Person("Bob");
        Person p3 = new Person("Clark");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list);
    }
}


class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}