package func_interfaces_in_java.predicate;

import java.util.Enumeration;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        int number = 20 ;
        System.out.println(test(20) );

        Predicate<Integer>  predicate = (a) -> (a >= 20 )  ;
        System.out.println( predicate.test(20)  );

}
public static boolean test(int a){
    if(a >= 20 )
    return  true ;

    return  false ;

    }
}

