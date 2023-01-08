package Collections.Ex_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);
        Lists.insertFirst(list, 1);
        Lists.insertLast(list, 3);
        Lists.replace(list, 6);
        list.add(5, 666);
        Lists.removeThird(list);
        System.out.println("New list: " + list);
        Lists.removeEvil(list);
        System.out.println("Square list: " + Lists.generateSquare());

        System.out.println(Lists.generateSquare());
        System.out.println(Lists.contains(list, 10));
        System.out.println(Lists.contains(list, 3));

        Lists.reverse(list);
        System.out.println("Reverse list: " + list);
        Lists.reverse(list);
        System.out.println("Reverse list: " + list);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Original list: " + list2);
        Lists.insertBeginningEnd(list2, 0);
    }
}
