package Collections.comparatorANDcomaparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();


        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Kate"));
        people.add(new Person(3, "Mike"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.id > o2.id)
                    return 1;
                else if (o1.id < o2.id)
                    return -1;
                else return 0;
            }
        });

        for (Person p: people){
            System.out.println(p.name);
        }


    }
}
