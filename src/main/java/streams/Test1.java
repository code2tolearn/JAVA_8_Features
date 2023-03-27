package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 24, 25, 5, 35, 222);
        // print a list starting with two
        //list.stream().map(a->String.valueOf(a)).filter(a->a.startsWith("2")).forEach(System.out::println);
        List<String> list1 = list.stream().map(a -> String.valueOf(a)).filter(a -> a.startsWith("2")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
