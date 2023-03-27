package streams.practiceprblm;

import java.util.Arrays;

public class MinMaxintArray {
    public static void main(String[] args) {
        //Remove duplicate numbers and find min and max in list using stream api. ( li
         String str = "1254685213697412585265" ;
               String[] arr = str.split("") ;
              int[] arrays = new int[arr.length];

               for( int i=0 ; i<arr.length; i++){
                   arrays[i] = Integer.parseInt(arr[i]) ;
               }

                int min = Arrays.stream(arrays).min().getAsInt() ;
                int max = Arrays.stream(arrays).max().getAsInt() ;
        System.out.println("Maximum of Array::"+max +"  " +"Minimum of array::"+min);
        System.out.println();
                       Arrays.stream(arrays).distinct().forEach(System.out::println);


    }
}
