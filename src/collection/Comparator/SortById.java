package collection.Comparator;

import java.util.Comparator;

public class SortById implements Comparator<ComparatorEx> {


    public int compare(ComparatorEx a, ComparatorEx b) {
        return a.id - b.id;
    }
}
