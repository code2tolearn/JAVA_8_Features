package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(111);
        list.add(12);
        list.add(14);
        list.add(15);
        // add numbers stream
        Optional<Integer> sum = Optional.of(list.stream().reduce((a, b) -> a + b).get());
        if(sum.isPresent())
            System.out.println(sum.get());
        // plz go through this artice of  reduse method
        //https://www.geeksforgeeks.org/stream-reduce-java-examples/
    }
}
