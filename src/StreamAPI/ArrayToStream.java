package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
    public static void main(String[] args) {
        String[] s = {"abc", "def", "ghi", "jkl"};

        Stream<String> stream = Arrays.stream(s);

        stream.sorted().forEach(System.out::println);

        System.out.println("-------------------");

        Stream<String> stream1 = Arrays.stream(s);

        stream1.map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));


    }


}
