package lab_10_oop.collections.MyList;

public class TestApp {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add("a", 0);
        list.add("b");
        list.add("c", 0);
        list.add("c", 3);
        list.add("d", 1);
        list.add("d", 0);
        System.out.println(list.size());
        System.out.println(list);
    }
}
