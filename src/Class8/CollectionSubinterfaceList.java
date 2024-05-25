package Class8;

import java.util.*;

public class CollectionSubinterfaceList {
    public static void main(String[] args) {

        // LIst
        List<Integer> integers = new ArrayList<>();
       integers.add(12);
       integers.add(85);
       integers.add(99);
//    for (Integer integer: integers){
//            System.out.println(integer);
//
//        }
    integers.add(2,45);
    integers.remove(1);

    List<Integer> integers1 =  Arrays.asList(12,21,15);
    integers.addAll(integers1);
//        for (Integer integer: integers){
//            System.out.println(integer);
//
//        }
        integers.removeAll(integers1);
//        for (Integer integer: integers){
//            System.out.println(integer);
//
//        }





    }
}
