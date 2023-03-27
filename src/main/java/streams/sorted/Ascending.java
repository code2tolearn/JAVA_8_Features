package streams.sorted;

import java.util.Arrays;
import java.util.List;

public class Ascending {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,56,8,9,111);
        list.stream().sorted().forEach(System.out::println);

    }
}
