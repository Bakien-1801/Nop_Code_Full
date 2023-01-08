package Collections.Ex_4.Comparator;

import java.util.Comparator;

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}

