package streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMapDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() ;
          names.add("Rogit") ;
          names.add("Kunal") ;
          names.add("Hardik") ;
          names.add("Suresh") ;
          names.add("Dhoni") ;
            Map<String , Integer> nameWithLength = names.stream().collect(Collectors.toMap(p->p,p->p.length())) ;
            System.out.println(nameWithLength);

    }
}

