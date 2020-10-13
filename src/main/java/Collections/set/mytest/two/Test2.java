package Collections.set.mytest.two;

import Collections.set.mytest.one.Test1;

import java.util.*;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {

        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        Set<Person> treeSet = new TreeSet<>();

        addToCollection(hashSet, "HashSet");
//        addToCollection(linkedHashSet, "LinkedHashSet");
//        addToCollection(treeSet, "TreeSet");

        List<Person> personList = new ArrayList<>();
        addToCollection(personList, "ArrayList");
    }

    static void addToCollection(Collection<Person> collection, String nameOfCollection) {
        System.out.println(nameOfCollection + ": ");
        collection.add(new Person(1, "Max"));
        collection.add(new Person(6, "Alex"));
        collection.add(new Person(4, "Sam"));
        collection.add(new Person(1, "Max"));
        System.out.println(collection);
        System.out.println();
    }


}
