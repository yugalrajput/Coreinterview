package collection.Comparator;

import java.util.Comparator;

public class SortBySalary implements Comparator<ComparatorEx> {


    public int compare(ComparatorEx a, ComparatorEx b) {
        if (a.name.equals(b.name)) {
            return a.salary - b.salary;
        } else if (a.id == b.id) {
            return a.salary - b.salary;

        } else {
            return a.salary - b.salary;
        }
    }
}
