package streams.miss;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomHighestSalary {
    public static void main(String[] args) {
        List<Integer> listOfSalary = Arrays.asList(10,20,30,40,50,60,70,80);
        // Find 3rd highest salary
        int a = listOfSalary.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().get()  ;
        System.out.println(a) ;
        // 3nd lowest
        int lowSalary = listOfSalary.stream().sorted().skip(2).findFirst().get() ;
        System.out.println(lowSalary);
        // 2ndHighest
        int secHighest = listOfSalary.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get() ;
        System.out.println(secHighest);

    }
}
