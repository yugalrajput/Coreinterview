package collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapIterate {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put(1, 100);
        m.put(2, 200);
        m.put(3, 300);
        m.put(4, 400);

        Set k = m.entrySet();
        for (Object o : k) {
            System.out.println(o);
        }
    }
}
