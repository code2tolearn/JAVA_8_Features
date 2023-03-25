package streams.filterandmapping;

import java.util.ArrayList;
import java.util.List;

public class NameMapping {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>()  ;
        list.add("Anushka") ;
        list.add("Ravina") ;
        list.add("Karishma") ;
        list.add("Rani") ;
        list.stream().map((name)-> name.toUpperCase()).forEach(System.out::println);


    }


}
                   