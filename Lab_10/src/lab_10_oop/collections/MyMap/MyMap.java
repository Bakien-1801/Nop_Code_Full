package lab_10_oop.collections.MyMap;

public interface MyMap {
    int size();

    Object get(Object key);

    void put(Object key, Object value);

    void remove(Object key);

    boolean contains(Object key);
}
