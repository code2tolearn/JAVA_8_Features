package streams.practiceprblm;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String input = "bookkeeper";
        Stream<String> stream = Stream.of(input.toLowerCase().split("")) ;
//          Long l = stream.collect(Collectors.counting()) ;
//        System.out.println(l);
         //Set<Map.Entry<String ,Long>> set = stream.collect(Collectors.groupingBy(e->e , Collectors.counting())).entrySet();
        // set.stream().map(e->e.getKey()+"->"+e.getValue()).forEach(System.out::println);
         // Stream<String> stream1 = Stream.of(input.toLowerCase().split("")) ;
         // stream.collect(Collectors.groupingBy(e->e ,Collectors.counting()));
//        Stream.of(input.toLowerCase().split(""))
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .map(e -> e.getKey()+"->"+e.getValue()+" ")
//                .forEach(System.out::print);

      Map<String , Long > map =   Stream.of(input.toUpperCase().split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
                            map.entrySet().stream().map(e->e.getKey()+"->"+e.getValue()).forEach(System.out::println);

                               System.out.println(map);
    }
}
