package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        Iterator i = l.iterator();

        while (i.hasNext()) {
            int j = (Integer) i.next();
            System.out.println(j);


            if (j % 2 == 0) {
                i.remove();
            }
        }
        System.out.println(l);
    }
}
