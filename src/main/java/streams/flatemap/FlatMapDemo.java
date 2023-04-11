package streams.flatemap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> javaCourses = Arrays.asList("CoreJava" ,"AdvJava" , "SBMS" , "JRTP" ) ;
        List<String> uiCourses = Arrays.asList("HTML" ,"CSS3" , "Angular" , "React" ) ;
        List<String> cloudCourses = Arrays.asList("Devops" ,"AWS" , "Azure" , "GCP" ) ;

        List<List<String>> courses = Arrays.asList(javaCourses , uiCourses , cloudCourses) ;

        Stream<List<String>> stream = courses.stream() ;

        Stream<String> ashokCourses = stream.flatMap(s -> s.stream()) ;

         ashokCourses.forEach(System.out::println);
    }
}
