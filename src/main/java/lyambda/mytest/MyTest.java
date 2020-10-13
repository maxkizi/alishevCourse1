package lyambda.mytest;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MyTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        addToCollections(list, "ArrayList");


        List<Integer> names = list.stream().map(person -> person.getId()).filter(person -> person > 5).collect(Collectors.toList());
        System.out.println(names);

    }
    static void addToCollections(Collection<Person> collection, String nameOfCollection) {
        System.out.println(nameOfCollection + ": ");
        collection.add(new Person(1, "Max"));
        collection.add(new Person(6, "Alex"));
        collection.add(new Person(4, "Sam"));
        collection.add(new Person(1, "Max"));
        System.out.println(collection);
        System.out.println();
    }
}

