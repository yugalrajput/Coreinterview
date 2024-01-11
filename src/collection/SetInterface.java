package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.contains(3));
        System.out.println(h.remove(4));
        System.out.println(h.hashCode());
        System.out.println(h);



        System.out.println("--------------");

        TreeSet t = new TreeSet();

        t.add(35);
        t.add(25);
        t.add(30);
        t.add(40);

        System.out.println(t.size());
        //provide greater or equal || provide null if not greater available
        System.out.println(t.ceiling(32));
        System.out.println(t.contains(30));
        System.out.println(t.pollFirst());
        System.out.println(t.descendingSet());
        System.out.println(t.lower(42));
        System.out.println("---------------------------");


        LinkedHashSet l = new LinkedHashSet();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);

        System.out.println(l.contains(300));
        System.out.println(l.size());
        System.out.println(l.isEmpty());
         System.out.println(l.remove(400));
        System.out.println(l.hashCode());
        System.out.println(l.removeAll(l));
        System.out.println(l.size());






    }
}
