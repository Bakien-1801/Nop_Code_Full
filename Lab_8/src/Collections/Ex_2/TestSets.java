package Collections.Ex_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> second = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19));
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.unionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.union(first, second));
        List<Integer> list = Sets.toList(first);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesManual(list));
        System.out.println(Sets.firstRecurringCharacter("abcabc"));
        System.out.println(Sets.allRecurringChars("mamama"));
        Integer[] arr = Sets.toArray(first);
        System.out.println(Arrays.toString(arr));
        TreeSet<Integer> treeSet = new TreeSet<>(first);
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet, 2));

    }
}
