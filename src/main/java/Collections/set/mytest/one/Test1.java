package Collections.set.mytest.one;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {


    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        addToSet(hashSet);
        System.out.println("HASH SET:");
        System.out.println(hashSet);
        System.out.println();

        addToSet(linkedHashSet);
        System.out.println("LINKED HASH SET:");
        System.out.println(linkedHashSet);
        System.out.println();

        addToSet(treeSet);
        System.out.println("TREE SET:");
        System.out.println(treeSet);
        System.out.println();
    }

    static void addToSet(Set set) {
        Integer[] num = new Integer[]{1, 4, 10, 0, 3};
        for (Integer i : num)
            set.add(i);
    }

}
