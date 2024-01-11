package collection.Comparator;

import java.util.Comparator;

public class SortByName implements Comparator<ComparatorEx> {


    public int compare(ComparatorEx a, ComparatorEx b) {
        return a.name.compareTo(b.name);

       /* if (a.name.equals(b.name)) {
            return a.id - b.id;
        } else {
            return a.id - b.id;
        }*/
    }
}
