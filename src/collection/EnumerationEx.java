package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector l = new Vector();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        Enumeration en = l.elements();

        while (en.hasMoreElements()) {
            // String str = (String) en.nextElement();
            // System.out.println(str);
            System.out.println(en.nextElement());
        }
    }

}
