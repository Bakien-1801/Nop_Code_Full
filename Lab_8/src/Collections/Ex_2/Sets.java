package Collections.Ex_2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        // Function returning the intersection o two given sets
        Set<Integer> newList = new HashSet<Integer>();
        for (int i = 0; i < first.size(); i++) { // for (int i = 0; i < first.size(); i++) {
            if (second.contains(i)) { // check xem phan tu i co nam trong second khong
                newList.add(i); // neu co thi them vao newList
            }
        }
        return newList;

    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        // Function returning the union o two given sets
        Set<Integer> newList = new HashSet<Integer>();
        for (int i = 0; i < first.size(); i++) {
            newList.add(i);
        }
        for (int i = 0; i < second.size(); i++) {
            newList.add(i);
        }
        return newList;

    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        // Function returning the intersection o two given sets(see retainAll() method)
        Set<Integer> newList = new HashSet<Integer>();
        newList.retainAll(second);
        return newList;

    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        // Function returning the union o two given sets(see addAll() method)
        Set<Integer> newList = new HashSet<Integer>();
        newList.addAll(second);
        return newList;

    }

    public static List<Integer> toList(Set<Integer> source) {
        // Function to transform a set into a list without duplicates
        // Note well : collections can be created from another collection !
        List<Integer> newList = new ArrayList<Integer>(source);
        return newList;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        // Function to remove duplicates from a list
        // Note well : collections can be created from another collection !
        Set<Integer> newList = new HashSet<Integer>(source);
        List<Integer> newList2 = new ArrayList<Integer>(newList);
        return newList2;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        // Function to remove duplicates from a list
        // without using the constructor trick seen above
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < source.size(); i++) { // check xem phan tu i co nam trong newList khong
            if (!newList.contains(source.get(i))) { // neu khong thi them vao newList
                newList.add(source.get(i)); // neu co thi khong lam gi ca
            }
        }
        return newList;

    }

    public static String firstRecurringCharacter(String s) {
        // Function accepting a string s
        // returning the first recurring character
        // For example firstRecurringCharacter("abcda") returns "a"
        if (s == null || s.length() == 0) { // check xem s co null hay khong
            return null;
        }
        Set<String> newList = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            if (newList.contains(s.charAt(i) + "")) { // check xem phan tu i co nam trong newList khong
                return s.charAt(i) + "";
            }
            newList.add(s.charAt(i) + ""); // neu khong co thi them vao newList
        }
        return null;

    }

    public static Set<Character> allRecurringChars(String s) {
        if (s == null || s.length() == 0) { // check xem s co null hay khong
            return null;
        }
        Set<Character> set = new HashSet<Character>();
        Set<Character> result = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) { // check xem phan tu i co nam trong set khong
                result.add(s.charAt(i)); // neu co thi them vao result
            } else {
                set.add(s.charAt(i)); // neu khong co thi them vao set
            }
        }
        return result;

    }

    public static Integer[] toArray(Set<Integer> source) {
        // Function to transform a set into an array
        
        return source.toArray(new Integer [0]);

    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();

    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();

    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);

    }


}
