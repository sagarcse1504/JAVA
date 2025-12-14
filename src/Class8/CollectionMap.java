package Class8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollectionMap {
    public static void main(String[] args) {
        Map<String, Object> objectmap = new HashMap<>();
        objectmap.put("Name:", "Sagar");
        objectmap.put("Age: ", 23);
        objectmap.put("Heigh: ", 5.6);
        System.out.println(objectmap.toString());
    }
}
