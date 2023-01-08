package lab_10_oop.collections.MyMap;

public class TestApp {
    public static void main(String[] args) {
        MyMap myMap = new MyHashMap();
        myMap.put(11, "Nicola");
        myMap.put(11, "Nicola");
        myMap.put(21, "Marzia");
        myMap.put(18, "bk");
        myMap.put(33, "bia");
        myMap.put(1975, "Hanoi");
        System.out.println(myMap.contains(11));
        System.out.println(myMap.contains(77));
        System.out.println(myMap.size());
        System.out.println(myMap);
    }
}
