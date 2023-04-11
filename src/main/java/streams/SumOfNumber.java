package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(111);
        list.add(12);
        list.add(14);
        list.add(15);
        // add numbers stream
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        if (sum.isPresent())
            System.out.println(sum.get());
        // plz go through this artice of  reduse method
        System.out.println(sum);
        //https://www.geeksforgeeks.org/stream-reduce-java-examples/

        // avg
        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);
        Double avg = list1.stream().collect(Collectors.averagingInt(e -> e));
        System.out.println(avg);
        Double avg1 = list1.stream().mapToInt(e->e).average().getAsDouble() ;
        System.out.println(avg1);
         // find avg of the sqaure of numbers hving > 100
             Double squareOFNum =   list1.stream().mapToInt(a->a*a).filter(a->a>100).average().getAsDouble() ;
             System.out.println(squareOFNum);
        // find Even numbers and Odd Numbers
        List<Integer> listOfOdd =   list.stream().filter(a->a%2!=0).collect(Collectors.toList()) ;
        System.out.println(listOfOdd);
        List<Integer> listOfEven = list.stream().filter(a->a%2==0).collect(Collectors.toList()) ;
        System.out.println(listOfEven);
        // Print the list Start With 2
        List <Integer> list2=Arrays.asList(2,24,25,5,35,222);
            list2.stream().map(a->String.valueOf(a)).filter(a->a.startsWith("2")).map(a->Integer.valueOf(a)).collect(Collectors.toList()).forEach(System.out::println);
       // Print the list start with 3
       list2.stream().map(a->String.valueOf(a)).filter(a->a.startsWith("3")).map(a->Integer.valueOf(a)).collect(Collectors.toList()).forEach(System.out::println);
        // Duplicate Number
        List <Integer> list3=Arrays.asList(2,2,3,4,5,6,7,8,9,5,4,6);
        Set<Integer> duplicateList = list3.stream().filter(a-> Collections.frequency(list3,a)>1).collect(Collectors.toSet()) ;
        System.out.println(duplicateList);
        // Find maximum and Minimum
        Integer max = list3.stream().max(Integer::compareTo).get() ;
        Integer min = list3.stream().min(Integer::compareTo).get() ;
        System.out.println("Maximum number is::"+max+" "+"Minimum Number is::"+min);
        // Ascending Order
        list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
         // Sum of 1st five element
         Integer sumOfFive = list2.stream().limit(5).reduce((a,b)->a+b).get() ;
        System.out.println(sumOfFive);

        // Find Salary
        // 3rd highest , 2nd Highest , Highest
        List <Integer> salary =Arrays.asList(10,20,30,40,50,60,70,80);
        Integer thirdHighest =  salary.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().get() ;
        System.out.println(thirdHighest);
        Optional<Integer> secHighest = salary.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
        if(secHighest.isPresent())
            System.out.println(secHighest) ;
        // find 3rd lowest
        Optional<Integer>  thirdLowest = Optional.of(salary.stream().sorted().skip(2).findFirst().get());

      }
    }
