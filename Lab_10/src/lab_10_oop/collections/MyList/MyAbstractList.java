package lab_10_oop.collections.MyList;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < size(); i++){
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }
}
