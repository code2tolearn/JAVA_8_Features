package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,50);
        // Square of Number
       //   double avg=list.stream().map(a->a*a).filter(a->a>100).mapToInt(a->a).average().getAsDouble();
        //  System.out.println(avg);
       Stream<Integer>  stream = list.stream().map(a->a*a).filter(a->a>100 ) ;
        Double avg = stream.mapToInt(a->a).average().getAsDouble() ;
        System.out.println(avg);

    }
}
