package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        // ArrayBlockingQueue l = new ArrayBlockingQueue(5);
        Vector l = new Vector();

        l.add(1);
        l.add(2);

        Enumeration it = l.elements();

        l.add(3);
        l.add(4);
        l.add(5);

        while (it.hasMoreElements()) {
            System.out.println(it.nextElement());


        }

    }
}
