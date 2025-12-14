package Class8;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        // Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(95);
        integerSet.add(78);
        integerSet.add(79);

        integerSet.remove(79);


        for (Integer integerset:integerSet){
            System.out.println(integerset);
        }
    }
}
