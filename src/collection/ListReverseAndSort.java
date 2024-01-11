package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListReverseAndSort {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(2);

        Collections.sort(l);
        Collections.reverse(l);
        System.out.println(l);
        System.out.println(l);
    }
}
