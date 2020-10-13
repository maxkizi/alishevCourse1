package Collections.comparatorANDcomaparable.comparable;

import java.util.*;

public class TestComparable {
    public static void main(String[] args) {
        List <Person> personList = new ArrayList<>();
        Set <Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

        Collections.sort(personList);
        System.out.println(personList);





    }
    private static void addElements (Collection collection){
        collection.add(new Person(2, "Tom"));
        collection.add(new Person(3, "Katy"));
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(4, "George"));
    }

}
