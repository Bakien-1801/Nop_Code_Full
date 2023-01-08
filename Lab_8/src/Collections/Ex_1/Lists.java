package Collections.Ex_1;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        //ArrayList<Integer> newList = new ArrayList<Integer>(list);
        if (list == null) {
            return;
        }
        list.add(0, value);

    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        //ArrayList<Integer> newList = new ArrayList<Integer>(list);
        if (list == null) {
            return;
        }
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        //ArrayList<Integer> newList = new ArrayList<Integer>(list);
        // check xem mang co 3 phan tu
        if (list == null || list.size() < 3){
            return;
        }
        list.set(2,value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list == null || list.size() < 3){
            return;
        }
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        //list.removeIf(integer -> integer == 666);
        int testEvil = 666;
        for (int i = 0; i < list.size(); i++) {
            if (testEvil == list.get(i)) {
                list.remove(i);
            }
        }
        //System.out.println(list);
    }

    public static ArrayList<Integer> generateSquare() {
        // Function returning a ArrayList<Integer > containing
        //the first 10 square numbers ( i . e . , 1 , 4 , 9 , 1 6 , . . . )
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            newList.add(i * i);
        }
        return newList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        // Function to verify if a list contains a certain value
//        if (list.contains(value)) {
//            return true;
//        }
//        return false;
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        // Function to copy a list into another list (without using library functions)
        //Note well : the target list must be emptied before the copy
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
        //System.out.println(target);
    }

    public static void reverse(ArrayList<Integer> list) {
        //Function to reverse the elements of a list
        Collections.reverse(list);
    }
    public static void reverseManual(ArrayList <Integer> list){
        //Function to reverse the elements of a list (without using library functions)
        for(int i = 0; i < list.size()/2; i++){ // list.size()/2 de tranh truong hop list.size() la so le
            int temp = list.get(i); // lay phan tu dau tien
            list.set(i, list.get(list.size() - 1 - i)); // gan phan tu dau tien = phan tu cuoi cung
            list.set(list.size() - 1 - i, temp); // gan phan tu cuoi cung = phan tu dau tien
        }
    }

    public static void insertBeginningEnd(LinkedList <Integer> list, int value){
        /*
        Function to insert the same element both at the
        ∗ beginning and the end o f the same LinkedLi s t
        ∗ Note w ell : you can use LinkedList specific methods
        */
        list.add(value); // them phan tu vao cuoi
        list.add(0, value); // them phan tu vao dau
        // LinkedList
        /*
        * list.addFirst(value);
        * list.addLast(value);
        * */
    }


}
