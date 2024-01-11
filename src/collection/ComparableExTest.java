package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExTest {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(new ComparableEx(24, "a", 100));
        l.add(new ComparableEx(3, "a", 102));
        l.add(new ComparableEx(23, "j", 105));

        Collections.sort(l);
        for (Object o : l) {
            System.out.println(o);
        }

    }
}
