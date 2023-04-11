package streams.collectors.grouping;

import streams.User;
import streams.filterandmapping.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>() ;
        users.add(new User("Ram" ,10000,"india" )) ;
        users.add(new User("Ani" ,20000,"Canada" )) ;
        users.add(new User("Sunil" ,30000,"India" )) ;
        users.add(new User("Orlen" ,40000,"Japan" )) ;
        users.add(new User("ChingChong" ,50000,"China" )) ;

        Map<String , List<User>> map = users.stream().collect(Collectors.groupingBy(User::getCountry)) ;
        System.out.println(map);
          User u1 = null ;
          // Optional class object creation
        Optional<User> personOptional = Optional.ofNullable(u1) ;
     }
}
