package streams.matching;

import streams.filterandmapping.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchingDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Shailesh", 25, "Software","India");
        Person p2 = new Person("Satish", 30, "Doctor","USA");
        Person p3 = new Person("Suresh patil ", 42, "Engineer", "Canada");
        Person p4 = new Person("Praful naik ", 26, "Teacher" , "China");
        Person p5 = new Person("Suresh Prebhu", 32, "Politician" , "India") ;
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5) ;
        // anymatch boolean method
        boolean isIndian = personList.stream().anyMatch(p -> p.getCountry().equals("India")) ;
        System.out.println("Is indian availble ::" + isIndian);
        // all records matching
        boolean allIndian = personList.stream().allMatch(p->p.getCountry().equals("India")) ;
        System.out.println("All indians are there ::" + allIndian);
        // check there should not be any Indian
        boolean noneIndian = personList.stream().noneMatch(p->p.getCountry().equals("Indian")) ;
        System.out.println("There is no  Indian ::" + allIndian);
    }
}
