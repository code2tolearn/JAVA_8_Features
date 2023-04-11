package stringpractice;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatingChar {
    public static void main(String[] args) {
        String str="shubham gajbhiye";
        char[] arr = str.toCharArray() ;
        int[] freq = new int[26] ;
        HashMap<Character , Integer> freqMap = new HashMap<>() ;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i] , freqMap.get(arr[i])+1 ) ;
            }else {
                freqMap.put(arr[i] , 1) ;
            }
        }
      Integer max = 0 ;
        Character ans = null ;
        for(Character ch :freqMap.keySet())
        {
            if(freqMap.get(ch)>max)
            {
                max = freqMap.get(ch) ;
                ans = ch ;
            }
        }
        System.out.println("Repeating Character is::"+ans+":"+freqMap.get(ans)+"times");
    }
}
