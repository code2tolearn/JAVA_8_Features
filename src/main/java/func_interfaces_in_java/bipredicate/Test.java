package func_interfaces_in_java.bipredicate;

import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
        BiPredicate<Integer , Integer> biPredicate = (a, b ) -> (a+b> 100) ;
        System.out.println(  biPredicate.test(50,50)  );
    }
}
