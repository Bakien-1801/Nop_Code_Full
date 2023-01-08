package lab_10_oop.collections.MyMap;

import java.awt.image.Kernel;
import java.util.Arrays;

public class MyHashMap implements MyMap {
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            table[bucket] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        return table[getBucket(key)] != null;
    }

    @Override
    public int size() {
        return size;
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return size / (double) table.length;
    }

    void enlarge() {
//        MyHashMapEntry[] tmp = new MyHashMapEntry[table.length * 2];
//        System.arraycopy(table, 0, tmp, 0, table.length);
//        table = tmp;
        table = Arrays.copyOf(table, table.length * 2);
    }
}
