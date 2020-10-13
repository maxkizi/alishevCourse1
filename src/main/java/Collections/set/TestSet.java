package Collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
       Set <Integer> set1 = new HashSet<>();

       for(int i =0; i <6; i++){
           set1.add(i);
       }


       Set <Integer> set2 = new HashSet<>();
        for(int i =2; i <8; i++){
            set2.add(i);
        }

        System.out.println(set1);
        System.out.println(set2);

        //union - объединение множеств
        System.out.println("Объединение множеств");
        Set <Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //intersection - пересечение множеств
        System.out.println("пересечение множеств");
        Set <Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //difference - разность множеств
        System.out.println("разность множеств");
        Set <Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);




    }
}
