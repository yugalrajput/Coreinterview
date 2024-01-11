package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1000);
        l.add(500);
        l.add(1500);
        l.add(2500);
        l.add(520);

        System.out.println("First Highest Salary");
        l.stream().distinct().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));

        System.out.println("Second Highest Salary");
        l.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e -> System.out.println(e));
    }
}
