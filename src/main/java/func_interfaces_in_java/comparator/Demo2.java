package func_interfaces_in_java.comparator;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        Person p = new Person("shailesh" , 25)  ;
        Person p1 = new Person("samir" , 25)  ;
        Person p2 = new Person("Sarika" ,  28 )  ;
        Person p3 = new Person("Santosh" ,  30 )  ;
        Person p4 = new Person("Ram" ,  22 )  ;

        System.out.println("Before sorting ::" );

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p) ;
        System.out.println(personList) ;
        Collections.sort(personList,
             ( o1,  o2) ->
             {
              return    (o1.getAge() > o2.getAge()) ? 1 : (o1.getAge() < o2.getAge()) ? -1 : 0;
             }
        ) ;
        System.out.println(personList) ;
    }

}
