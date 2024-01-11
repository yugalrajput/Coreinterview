package collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        // ComparatorEx c1 = new ComparatorEx(1, "yugal", 800);
        //  ComparatorEx c2 = new ComparatorEx(3, "aman", 700);
        //  ComparatorEx c3 = new ComparatorEx(2, "rajput", 600);


        ArrayList l = new ArrayList();
        //  l.add(c1);
        l.add(new ComparatorEx(1, "yugal", 800));//asaa b krr skte h
        l.add(new ComparatorEx(1, "yugal", 700));
        l.add(new ComparatorEx(2, "rajput", 600));

       //  Collections.sort(l, new SortByName());
      //  Collections.sort(l, new SortById());
         Collections.sort(l, new SortBySalary());

        for (Object o : l) {
            System.out.println(o);
        }

    }
}
