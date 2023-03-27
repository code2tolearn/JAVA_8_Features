package func_interfaces_in_java.predicate;

import streams.filterandmapping.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Person p1 = new Person("Shailesh", 25, "Software","India");
        Person p2 = new Person("Satish", 30, "Doctor","USA");
        Person p3 = new Person("Suresh patil ", 42, "Engineer", "Canada");
        Person p4 = new Person("Praful naik ", 26, "Teacher" , "China");
        Person p5 = new Person("Suresh Prebhu", 32, "Politician" , "India") ;
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5) ;

        Predicate<Person> personPredicate = p->p.getAge()>20 ;
        for(Person person:personList){
            if(personPredicate.test(person))
                System.out.println("Eligible" );
        }
    }
}
