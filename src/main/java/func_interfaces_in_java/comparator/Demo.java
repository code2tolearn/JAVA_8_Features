package func_interfaces_in_java.comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Demo {

    public static void main(String[] args) {
        Person p = new Person("shailesh" , 25)  ;
        Person p1 = new Person("samir" , 25)  ;
        Person p2 = new Person("Sarika" ,  28 )  ;
        Person p3 = new Person("Santosh" ,  30 )  ;
        Person p4 = new Person("Ram" ,  22 )  ;

        System.out.println("Before sorting ::" );

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p) ;
        System.out.println(personList) ;
        Collections.sort(personList, new MyAppSorting()) ;
        System.out.println(personList) ;
    }

}
