package streams.findingoperation;

import streams.filterandmapping.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Shailesh", 25, "Software","India");
        Person p2 = new Person("Satish", 30, "Doctor","USA");
        Person p3 = new Person("Suresh patil ", 42, "Engineer", "Canada");
        Person p4 = new Person("Praful naik ", 26, "Teacher" , "China");
        Person p5 = new Person("Suresh Prebhu", 32, "Politician" , "India") ;
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5) ;

        Optional<Person> firstPerson = personList.stream().filter(p->p.getCountry().equals("India")).findFirst() ;
          if(firstPerson.isPresent())
          {
              System.out.println(firstPerson.get());
          }
        System.out.println("***********************************************");
          // findAny
        Optional<Person> findAny = personList.stream().filter(p->p.getCountry().equals("India")).findAny() ;
          if(findAny.isPresent()){
              System.out.println(findAny.get());
          }
    }
}
