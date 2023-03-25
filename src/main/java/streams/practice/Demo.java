package streams.practice;

import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer>  stream =   Stream.of(1,2,3,3,4,5,8,12,15,18,7,9) ;

        //  stream.forEach((i)-> System.out.println(i));
           /*
            * Here lambda is a consumer interface not returning anything but accepting arg
            *
            */

        //  stream.forEach(System.out::println);
          // this is a method reference

//         stream.filter((i)-> (i>= 6))
//                 .forEach((i)-> System.out.println(i));
         // also you can do like
        Stream<Integer>  filterStream = stream.filter(i -> i>= 6 ) ;
        filterStream.forEach(System.out::println);
    }
}
