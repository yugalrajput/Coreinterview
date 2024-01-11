package collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
    public static void main(String[] args) {
        List l = new ArrayList();
       // ArrayBlockingQueue<Integer> l =new ArrayBlockingQueue<>(7);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);


       Iterator it =l.iterator();

      //  l.add(3);
     //   l.clear();
        //l.add(4);

        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
