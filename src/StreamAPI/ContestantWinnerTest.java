package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContestantWinnerTest {
    public static void main(String[] args) {
        List<ContestantWinner> l = new ArrayList<ContestantWinner>();
        l.add(new ContestantWinner("8978456532","yugal"));
        l.add(new ContestantWinner("9875645123","rajput"));
        l.add(new ContestantWinner("9835214785","aman"));
        l.add(new ContestantWinner("8545645123","rajput"));

        l.stream().map(c -> c.getName()+" "+c.getPhoneno()).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),c->{
            Collections.shuffle(c);
            return c.stream();

        })).limit(4).forEach(c-> System.out.println(c));

    }
}
