package streams.sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,56,8,9,111);
        //  list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
       List<Integer> list1 =   list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
