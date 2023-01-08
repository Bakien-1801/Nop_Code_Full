package Collections.Ex_3;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Maps {
    public static int count(Map<Integer, Integer> map) {
        //Function to return the number of key-value mappings of a map
        //Hàm trả về số size  ánh xạ key-giá trị của một map
        return map.size();

    }

    public static void empty(Map<Integer, Integer> map) {
        //Function to remove all mappings from a map
        map.clear();

    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        //Function to test if a map contains a mapping for the specified key
        return map.containsKey(key); //return true if map contains key

    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value; //return true if map contains key and value 
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "red");
        map.put(1, "blue");
        map.put(2, "yellow");
        return 0 <= value && value <= 2 ? map.get(value) : null;
    }


}
