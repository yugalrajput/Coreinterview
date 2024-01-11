package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedInterface {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();

        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);


        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.size());
        System.out.println(s.tailSet(200));
        System.out.println(s.headSet(200));
    }
}
