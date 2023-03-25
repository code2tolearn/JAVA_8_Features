package func_interfaces_in_java.predicate;

import streams.filterandmapping.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        Person p1 = new Person("Shailesh", 25, "Software");
        Person p2 = new Person("Satish", 30, "Doctor");
        Person p3 = new Person("Suresh patil ", 42, "Engineer");
        Person p4 = new Person("Praful naik ", 26, "Teacher");

        List<Person> list = Arrays.asList(p1,p2,p3,p4) ;
        Predicate<Person> lowerLimit = p -> p.getAge() > 18 ;
        Predicate<Person> upperLimit = p -> p.getAge() < 30 ;

        Predicate<Person> predicate = lowerLimit.and(upperLimit) ;
        for(Person person:list)
        {
            if(predicate.test(person))
            {
                System.out.println(person);
            }
        }

    }
}
