package streams.filterandmapping;

import java.util.ArrayList;
import java.util.List;

public class FilterNames {
    public static void main(String[] args) {
        List<String>  nameList = new ArrayList<>() ;
        nameList.add("Pooj hege ") ;
        nameList.add("Nayantara ") ;
        nameList.add("Samntha mandana ") ;
        nameList.add("Kirti Suresh  ") ;

//        Stream<String> stream = nameList.stream() ;
//         Stream<String> filterStream =stream.filter((name) -> name.startsWith("K"));
//          filterStream.forEach(System.out::println);

        nameList.stream().filter(name-> name.startsWith("K")).forEach(System.out::println);
    }

}
