package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateElement {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> l = Arrays.asList(2, 4, 4, 5, 6, 6, 7, 7);
        Set<Integer> set = new HashSet<Integer>();

        l.stream().filter(n -> !set.add(n)).forEach(e -> System.out.println(e));
    }
}
