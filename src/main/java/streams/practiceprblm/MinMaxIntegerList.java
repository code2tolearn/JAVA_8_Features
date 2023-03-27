package streams.practiceprblm;

import java.util.Arrays;
import java.util.List;

public class MinMaxIntegerList {
    public static void main(String[] args) {
        Integer []arrays = {2,4,5,6,7,8,9,2,1,5,4,6,22,5,4,7,7,88,01} ;
        List<Integer> list = Arrays.asList(arrays) ;
        Integer maximum =   list.stream().max(Integer::compare).get() ;
        Integer minimum = list.stream().min((x, y) -> Integer.compare(x, y)).get() ;
        list.stream().distinct().forEach(System.out::println);
        System.out.println() ;
        System.out.println("Maximum of the ::"+maximum+" "+"minimum of the :: "+minimum);
    }
}
