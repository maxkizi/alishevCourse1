package Collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List <Integer> linkedList = new LinkedList<>();
        List <Integer> arrayList = new ArrayList<>();
        System.out.println("Время выполнения операции для: collections.linkedList" );
        measureTime(linkedList);
        System.out.println("Время выполнения операции для: collections.arrayList" );
        measureTime(arrayList);
    }



    private static void measureTime(List<Integer> list){


        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.add( 0, i);
        }
        /*for (Integer i: list){
            list.get(i);
        }*/
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
