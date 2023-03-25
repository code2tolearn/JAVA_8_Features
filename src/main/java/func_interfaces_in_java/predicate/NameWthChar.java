package func_interfaces_in_java.predicate;

import java.util.function.Predicate;

public class NameWthChar {
    public static void main(String[] args) {
        String []str = {"KAjal " , "Samantha","Anushka","Nayantara","Aliya", "Kirti"} ;
        Predicate<String> predicate = name -> name.startsWith("A") ;

         for(String name : str)
         {
             if(predicate.test(name))
             {
                 System.out.println(name);
             }
         }
    }
}
