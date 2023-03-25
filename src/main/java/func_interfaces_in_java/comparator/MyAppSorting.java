package func_interfaces_in_java.comparator;

import java.util.Comparator;

public class MyAppSorting implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
            Person p1 = (Person) o1 ;
            Person p2 = (Person) o2 ;
            if(p1.getAge() > p2.getAge())
            {
                return +1 ;
            }else if (p2.getAge() > p1.getAge())
            {
                return  -1 ;
            }else {
                return  0 ;
            }
        }
    }

