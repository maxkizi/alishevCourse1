package Collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i <10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList.get(0));
        for (Integer i:arrayList){
            System.out.println(i);
        }

    }

}