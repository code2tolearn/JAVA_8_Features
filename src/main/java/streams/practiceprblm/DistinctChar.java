package streams.practiceprblm;

import java.util.stream.Stream;

public class DistinctChar {
    public static void main(String[] args) {
        String str =  "abcabddpmncopqstcbcmc" ;
        Stream.of(str.toLowerCase().split("")).distinct().forEach((e->System.out.print(e)));
    }
}
