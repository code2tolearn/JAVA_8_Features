package streams.filterandmapping;

import java.util.Arrays;
import java.util.List;

public class PersonFilter {
    public static void main(String[] args) {
        Person p1 = new Person("Shailesh", 25, "Software");
        Person p2 = new Person("Satish", 30, "Doctor");
        Person p3 = new Person("Suresh patil ", 42, "Engineer");
        Person p4 = new Person("Praful naik ", 26, "Teacher");

       List<Person> personList = Arrays.asList(p1, p2, p3, p4);
//                personList.stream().filter((p)->p.getAge()>= 21 && p.getAge()<31 && p.getJob().equals("Software"))
//                        .forEach(System.out::println);
        //  filter the persons between age 21 to 30 and job ype is software

         personList.stream().filter(p -> p.getAge()>20 && p.getAge()<30 && p.getJob().equals("Software"))
            .forEach(System.out::println)  ;

    }
}